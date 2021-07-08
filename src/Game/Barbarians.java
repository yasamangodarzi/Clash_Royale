package Game;

public class Barbarians extends Soldier{

    public Barbarians() {
        speed=Speed.MEDIUM;
        target=Target.GROUND;
        HitSpeed=1.5;
        // Range
        //Is Area Splash
        Count=4;
        cost=5;
    }

    @Override
    public String toString() {
        return "Barbarians{" +
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
