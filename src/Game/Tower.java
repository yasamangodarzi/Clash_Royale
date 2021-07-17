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
//    private Speed speedTower = Speed.MEDIUM;



    //constructor
    public Tower(){
//        Range = 7;

       // HitSpeed = 1;
        speed = Speed.MEDIUM;
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
