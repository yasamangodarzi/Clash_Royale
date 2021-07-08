package Game;

public class Archer extends Soldier{
    public Archer() {
        speed=Speed.MEDIUM;
        target=Target.AIR_GROUND;
        HitSpeed=1.2;
        // Range
        //Is Area Splash
        Count=2;
        cost=3;
    }

    @Override
    public String toString() {
        return "Archer{" +
                "cost=" + cost +
                ", Damage=" + Damage +
                ", HP=" + HP +
                ", HitSpeed=" + HitSpeed +
                ", target=" + target +
                ", mode=" + mode +
                ", GameEndTime=" + GameEndTime +
                ", speed=" + speed +
                ", Count=" + Count +
                '}';
    }
}
