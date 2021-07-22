package Game;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Common game data.
 */
public class CommonGameData {
    /**
     * The Range.
     */
//filed
    protected double Range;
    /**
     * The Damage.
     */
    protected int Damage;
    /**
     * The Hp.
     */
    protected int HP;
    /**
     * The Opponent card.
     */
    protected  ArrayList<Playground> OpponentCard=new ArrayList<>();
    /**
     * The Hit speed.
     */
    protected double HitSpeed;
    /**
     * The Alive.
     */
    protected boolean alive=false;
    /**
     * The Target.
     */
    protected Target target;
    /**
     * The Mode.
     */
//If we are at the beginning of the game, its true, otherwise it is false, elixir = 4
    public boolean mode = true;
    /**
     * The Game end time.
     */
//If we are in the last minute of the game, the value of this variable will be true and otherwise it is false;
    public boolean GameEndTime = false;

    /**
     * Gets hit speed.
     *
     * @return the hit speed
     */
    public double getHitSpeed() {
        return HitSpeed;
    }

    /**
     * Sets hit speed.
     *
     * @param hitSpeed the hit speed
     */
    public void setHitSpeed(int hitSpeed) {
        HitSpeed = hitSpeed;
    }

    /**
     * Gets target.
     *
     * @return the target
     */
    public Target getTarget() {
        return target;
    }

//    public void setTarget(Target target) {
//        this.target = target;
//    }

    /**
     * Gets damage.
     *
     * @return the damage
     */
    public int getDamage() {
            return Damage;
        }

    /**
     * Sets damage.
     *
     * @param damage the damage
     */
    public void setDamage(int damage) {
            Damage = damage;
        }

    /**
     * Gets hp.
     *
     * @return the hp
     */
    public int getHP() {
            return HP;
        }

    /**
     * Sets hp.
     *
     * @param HP the hp
     */
    public void setHP(int HP) {
            this.HP = HP;
        }


}
