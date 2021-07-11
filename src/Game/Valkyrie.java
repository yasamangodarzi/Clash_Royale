package Game;

public class Valkyrie extends Soldier{
    public Valkyrie() {
        speed=Speed.MEDIUM;
        target=Target.GROUND;
        HitSpeed=1.5;
        // Range
        //Is Area Splash
        Count=1;
        cost=4;
        setCardName("Valkyrie");
    }
    @Override
    public String toString() {
        return "Valkyrie{" +
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
