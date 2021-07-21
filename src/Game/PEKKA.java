package Game;

public class PEKKA extends Soldier {
    public PEKKA() {
        speed=Speed.FAST;
        target=Target.GROUND;
        HitSpeed=1800;
        Range=0;
        AreaSplash=false;
        Count=1;
        cost=4;
        setCardName("PEKKA");
    }
    @Override
    public String toString() {
        return "PEKKA{" +
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
