package Game;

public class PEKKA extends Soldier {
    public PEKKA() {
        speed=Speed.FAST;
        target=Target.GROUND;
        HitSpeed=1.8;
        // Range
        //Is Area Splash
        Count=1;
        cost=4;
    }
    @Override
    public String toString() {
        return "Pekka{" +
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
