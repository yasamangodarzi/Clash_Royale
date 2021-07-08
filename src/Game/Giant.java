package Game;

public class Giant extends Soldier{
    public Giant() {
        speed=Speed.SLOW;
        target=Target.BUILDING;
        HitSpeed=1.5;
        // Range
        //Is Area Splash
        Count=1;
        cost=5;
    }

    @Override
    public String toString() {
        return "Giant{" +
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
