package Game;

public class Archer extends Soldier{
    public Archer() {
        speed=Speed.MEDIUM;
        target=Target.AIR_GROUND;
        HitSpeed=1200;
        Range=5;
        AreaSplash=false;
        Count=2;
        cost=3;
        setCardName("Archer");
    }

    @Override
    public String toString() {
        return "Archer{" +
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
