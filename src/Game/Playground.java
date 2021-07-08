package Game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playground extends CommonGameData{

    List<Integer> Space = new ArrayList<>();
    Map<Integer, List<String>> GoalsDistance = new HashMap<>();


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
}
