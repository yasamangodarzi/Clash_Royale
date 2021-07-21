package Game;

public class Valkyrie extends Soldier{
    public Valkyrie() {
        speed=Speed.MEDIUM;
        target=Target.GROUND;
        HitSpeed=1500;
        Range=0;
        AreaSplash=true;
        Count=1;
        cost=4;
        setCardName("Valkyrie");
    }
    @Override
    public String toString() {
        return "Valkyrie{" +
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
