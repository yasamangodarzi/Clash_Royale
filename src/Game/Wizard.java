package Game;

public class Wizard extends Soldier{
    public Wizard() {
        speed=Speed.MEDIUM;
        target=Target.AIR_GROUND;
        HitSpeed=1.7;
        // Range
        //Is Area Splash
        Count=1;
        cost=5;
        setCardName("Wizard");
    }

    @Override
    public String toString() {
        return "Wizard{" +
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
