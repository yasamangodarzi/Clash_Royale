package Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * The type Tower.
 */
public   class Tower extends Playground{

    //filed
    private int ShootingTime;
    private int CheckPrincessLife;
    private int LifeKing;
    /**
     * The Level game hp.
     */
    public HashMap<Integer, Integer>LevelGameHP;
    /**
     * The Level game damage.
     */
    public HashMap<Integer, Integer>LevelGameDamage;
//    private Speed speedTower = Speed.MEDIUM;


    /**
     * Instantiates a new Tower.
     */
//constructor
    public Tower(){
//        Range = 7;

       // HitSpeed = 1;
        speed = Speed.MEDIUM;
        HashMap<Integer, Integer>LevelGameHP = new HashMap<>();
        HashMap<Integer, Integer>LevelGameHitSpeed = new HashMap<>();
    }

    /**
     * Gets shooting time.
     *
     * @return the shooting time
     */
//method
    public int getShootingTime() {
        return ShootingTime;
    }

    /**
     * Sets shooting time.
     *
     * @param shootingTime the shooting time
     */
    public void setShootingTime(int shootingTime) {
        ShootingTime = shootingTime;
    }

    /**
     * Get life king int.
     *
     * @return the int
     */
    public int  getLifeKing(){
        return LifeKing;
    }


    @Override
    public String toString() {
        return "Tower{" +
                "Range=" + Range +
                ", Damage=" + Damage +
                ", HP=" + HP +
                ", OpponentCard=" + OpponentCard +
                ", alive=" + alive +
                '}';
    }
}
