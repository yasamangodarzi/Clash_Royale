package Game;

import java.util.*;

public class Playground extends CommonGameData{
 protected Location location=new Location();
    List<Integer> Space = new ArrayList<>();
    Map<Integer, ArrayList<Playground>> GoalsDistanceCard = new HashMap<>();
 protected Speed speed;

    public Playground() {
        HashMap<Integer, Integer>LevelGameHP = new HashMap<>();
        HashMap<Integer, Integer>LevelGameHitSpeed = new HashMap<>();
    }

    public Location getLocation() {
        return location;
    }

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
    public void doAction(long milisecond) {}
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
