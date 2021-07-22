package Game;

import java.util.*;

/**
 * The type Playground.
 */
public class Playground extends CommonGameData{
    /**
     * The Location.
     */
    protected Location location=new Location();
    /**
     * The Space.
     */
    List<Integer> Space = new ArrayList<>();
    /**
     * The Goals distance card.
     */
    Map<Integer, ArrayList<Playground>> GoalsDistanceCard = new HashMap<>();
    /**
     * The Speed.
     */
    protected Speed speed;

    /**
     * Instantiates a new Playground.
     */
    public Playground() {
        HashMap<Integer, Integer>LevelGameHP = new HashMap<>();
        HashMap<Integer, Integer>LevelGameHitSpeed = new HashMap<>();
    }

    /**
     * Gets location.
     *
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Detect proximity target card array list.
     *
     * @param DestinationRow    the destination row
     * @param DestinationColumn the destination column
     * @param ArrayCardOrigin   the array card origin
     * @param Range             the range
     * @return the array list
     */
    public ArrayList<Playground> DetectProximityTargetCard(int DestinationRow, int DestinationColumn,
                                                 ArrayList<Playground>ArrayCardOrigin,
                                                double Range) {

        int RowOrigin, ColumnOrigin;
        ArrayList<Playground> goal = new ArrayList<>();
        for(Playground cardOrigin: ArrayCardOrigin){
            if(cardOrigin.alive){
                RowOrigin = cardOrigin.location.getRow();
                ColumnOrigin = cardOrigin.location.getColumn();
                double distanceRes = 0;
                double ResultRowDifference = Math.pow((DestinationRow - RowOrigin), 2);
                double ResultColumnDifference = Math.pow((DestinationColumn - ColumnOrigin), 2);
                double distance = Math.sqrt(((int) ResultRowDifference + (int) ResultColumnDifference));
                Speed speed = cardOrigin.speed;
                    switch (speed) {
                        case FAST:
                            distanceRes = distance / 2;
                            break;
                        case MEDIUM:
                            distanceRes = distance;
                            break;
                        case SLOW:
                            distanceRes = distance * 2;
                            break;
                    }
                if (distanceRes <= Range){
                    Space.add((int) distanceRes);
                    GoalsDistanceCard.computeIfAbsent((int) distanceRes, k -> new ArrayList<>()).add(cardOrigin);
                    Collections.sort(Space);
                    ArrayList<Integer> SpaceSort = new ArrayList<>();
                    for (int temp : Space) {
                        SpaceSort.add(temp);
                    }
                    goal.add(GoalsDistanceCard.get(SpaceSort.get(0)).get(0));
                    for (int i = 1; i < SpaceSort.size(); i++) {
                        if (SpaceSort.get(0).equals(SpaceSort.get(i))) {
                            goal.add(GoalsDistanceCard.get(SpaceSort.get(0)).get(i));
                        }
                    }
                }
            }
        }
        return goal;
    }

    /**
     * Do action.
     *
     * @param milisecond the milisecond
     */
    public void doAction(long milisecond) {}

    /**
     * Check target boolean.
     *
     * @param playground the playground
     * @return the boolean
     */
    public boolean CheckTarget(Playground playground)
    {
        Target target1=target;
        System.out.println("Target"+target1);
        Target target2=playground.target;
        System.out.println("Target rival"+target2);

        if (playground instanceof Tower )
        {

            return true;
        }
        else if (playground instanceof Soldier || playground instanceof Building)
        {

            if (target1.equals(Target.AIR_GROUND)){return true;}
            if (target1.equals(Target.GROUND))
            {
                if (target2.equals(Target.GROUND)){return true;}
                if (target2.equals(Target.AIR_GROUND)){return false;}

            }
            if (target1.equals(Target.AIR))
            {
                if (target2.equals(Target.GROUND)){return false;}
                if (target2.equals(Target.AIR_GROUND)){return true;}

            }
            if (target1.equals(Target.BUILDING))
            {
                if ((playground instanceof Building))
                {
                    return true;
                }else
                {
                    return false;
                }
            }


        }
        return  true;
    }

    /**
     * Shoot.
     *
     * @param card the card
     */
    public void shoot(Playground card)
    {
        card.HP-=this.Damage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playground that = (Playground) o;
        return Objects.equals(location, that.location) && speed == that.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, speed);
    }
}
