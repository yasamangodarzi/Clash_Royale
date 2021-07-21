package Game;

public class Wizard extends Soldier{
    public Wizard() {
        speed=Speed.MEDIUM;
        target=Target.AIR_GROUND;
        HitSpeed=1700;
        Range=5;
        AreaSplash=true;
        Count=1;
        cost=5;
        setCardName("Wizard");
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "cost=" + cost +
                ", Range=" + Range +
                ", Damage=" + Damage +
                ", HP=" + HP +
                ", OpponentCard=" + OpponentCard +
                ", HitSpeed=" + HitSpeed +
                ", alive=" + alive +
                ", target=" + target +
                ", location=" + location +
                ", speed=" + speed +
                ", AreaSplash=" + AreaSplash +
                ", Count=" + Count +
                '}';
    }
}
