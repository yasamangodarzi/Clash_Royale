package Game;

import java.util.ArrayList;

public class CommonGameData {
        //filed
     protected int Range;
    protected int Damage;
   protected int HP;
   protected ArrayList<Card> OpponentCard=new ArrayList<>();
    protected double HitSpeed;
    protected Target target;
    protected boolean alive=false;
    //If we are at the beginning of the game, its true, otherwise it is false, elixir = 4
    public boolean mode = true;
    //If we are in the last minute of the game, the value of this variable will be true and otherwise it is false;
    public boolean GameEndTime = false;

    public double getHitSpeed() {
        return HitSpeed;
    }

    public void setHitSpeed(int hitSpeed) {
        HitSpeed = hitSpeed;
    }

    public Target getTarget() {
        return target;
    }

//    public void setTarget(Target target) {
//        this.target = target;
//    }

    public int getDamage() {
            return Damage;
        }

    public void setDamage(int damage) {
            Damage = damage;
        }

    public int getHP() {
            return HP;
        }

    public void setHP(int HP) {
            this.HP = HP;
        }

    public int getRange() {
        return Range;
    }

    public void setRange(int range) {
        Range = range;
    }
    public void doAction()
    {

    }
}
