package Game;

public class BabyDragon extends Soldier{
    public BabyDragon() {
        speed=Speed.FAST;
        target=Target.AIR_GROUND;
        HitSpeed=1.8;
        // Range
        //Is Area Splash
        Count=1;
        cost=4;
    }

    @Override
    public String toString() {
        return "BabyDragon{" +
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
