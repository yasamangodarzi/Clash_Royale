package Game;

import java.util.*;

public class Playground extends CommonGameData{

    List<Integer> Space = new ArrayList<>();
    Map<Integer, List<Card>> GoalsDistanceCard = new HashMap<>();


    public Playground() {
        HashMap<Integer, Integer>LevelGameHP = new HashMap<>();
        HashMap<Integer, Integer>LevelGameHitSpeed = new HashMap<>();
    }

    public void Shooting(){
        //In order to shoot the enemy
        //And checking that if the enemy's life ends, the enemy will be removed from map
        // and another target will be identified
        //Of course, in my opinion, this method can be written in general and be in the Playground class
        // so that both the soldier and the tower can shoot at the enemy.
    }

    public List<Card> DetectProximityTargetCard(int RowOrigin, int ColumnOrigin, int Range,
                                                int DestinationRow, int DestinationColumn,
                                                Card CardName, String Condition) {
        List<Card> goal = new ArrayList<>();
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
        if (distanceRes == Range){
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
        return goal;
    }
}
