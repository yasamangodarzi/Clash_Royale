package Game;

import java.util.*;

public class Playground extends CommonGameData{
 protected Location location=new Location();
    List<Integer> Space = new ArrayList<>();
    Map<Integer, List<Card>> GoalsDistanceCard = new HashMap<>();


    public Playground() {
        HashMap<Integer, Integer>LevelGameHP = new HashMap<>();
        HashMap<Integer, Integer>LevelGameHitSpeed = new HashMap<>();
    }

    public Location getLocation() {
        return location;
    }

    public List<Card> DetectProximityTargetCard(int DestinationRow, int DestinationColumn,
                                                int Range, ArrayList<Playground>ArrayCardOrigin,
                                                Card CardName, String Condition) {

        int RowOrigin, ColumnOrigin;
        List<Card> goal = new ArrayList<>();
        for(Playground cardOrigin: ArrayCardOrigin){
            if(cardOrigin.alive){
                RowOrigin = cardOrigin.location.getRow();
                ColumnOrigin = cardOrigin.location.getColumn();
                double distanceRes = 0;
                double ResultRowDifference = Math.pow((DestinationRow - RowOrigin), 2);
                double ResultColumnDifference = Math.pow((DestinationColumn - ColumnOrigin), 2);
                double distance = Math.sqrt(((int) ResultRowDifference + (int) ResultColumnDifference));
                if(Condition.equals("Card")) {
                    Speed speed = ((Soldier) CardName).getSpeed();
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
                }
                if (distanceRes <= Range){
                    Space.add((int) distanceRes);
                    GoalsDistanceCard.computeIfAbsent((int) distanceRes, k -> new ArrayList<>()).add(CardName);
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
}
