package Game;

public class Barbarians extends Soldier{

    public Barbarians() {
        speed=Speed.MEDIUM;
        target=Target.GROUND;
        HitSpeed=1500;
        Range=0;
        AreaSplash=false;
        Count=4;
        cost=5;
        setCardName("Barbarians");
    }


    @Override
    public String toString() {
        return "Barbarians{" +
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
