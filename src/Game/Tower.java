package Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public   class Tower extends Playground{

    //filed
    private int ShootingTime;
    private int CheckPrincessLife;
    private int LifeKing;
    public HashMap<Integer, Integer>LevelGameHP;
    public HashMap<Integer, Integer>LevelGameDamage;
//    List<Integer> Space = new ArrayList<>();
//    Map<Integer, List<String>> GoalsDistance = new HashMap<>();


    //constructor
    public Tower(){
//        Range = 7;

        HitSpeed = 1;
        HashMap<Integer, Integer>LevelGameHP = new HashMap<>();
        HashMap<Integer, Integer>LevelGameHitSpeed = new HashMap<>();
    }

    //method
    public int getShootingTime() {
        return ShootingTime;
    }

    public void setShootingTime(int shootingTime) {
        ShootingTime = shootingTime;
    }

    public int  getLifeKing(){
        return LifeKing;
    }

//    public abstract int DamageLevel(int GameLevel);
//    public abstract int HpLevel(int GameLevel);

//    public void ShootingTower(){
//        //In order to shoot the enemy
//        //And checking that if the enemy's life ends, the enemy will be removed from map
//        // and another target will be identified
//        //Of course, in my opinion, this method can be written in general and be in the Playground class
//        // so that both the soldier and the tower can shoot at the enemy.
//    }


    public List<String> DetectProximityTargetTower(int RowOrigin, int ColumnOrigin,
                                              int DestinationRow, int DestinationColumn,
                                              String CardName){
        double ResultRowDifference = Math.pow((DestinationRow - RowOrigin), 2);
        double ResultColumnDifference = Math.pow((DestinationColumn - ColumnOrigin), 2);
        double distance = Math.sqrt(((int) ResultRowDifference + (int) ResultColumnDifference));
        Space.add((int) distance);
        GoalsDistance.computeIfAbsent((int) distance, k ->new ArrayList<>()).add(CardName);
        Collections.sort(Space);
        ArrayList<Integer> SpaceSort = new ArrayList<>();
        List<String> goal = new ArrayList<>();
        for(int temp: Space) {
            SpaceSort.add(temp);
        }
        goal.add(GoalsDistance.get(SpaceSort.get(0)).get(0));
        for(int i = 1; i < SpaceSort.size(); i++){
            if(SpaceSort.get(0).equals(SpaceSort.get(i))){
                goal.add(GoalsDistance.get(SpaceSort.get(0)).get(i));
            }
        }
        return goal;
    }

}
