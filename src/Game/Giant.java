package Game;

/**
 * The type Giant.
 */
public class Giant extends Soldier{
    /**
     * Instantiates a new Giant.
     */
    public Giant() {
        speed=Speed.SLOW;
        target=Target.BUILDING;
        HitSpeed=1500;
        Range=0;
        AreaSplash=false;
        Count=1;
        cost=5;
        setCardName("Giant");
    }

    @Override
    public String toString() {
        return "Giant{" +
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
