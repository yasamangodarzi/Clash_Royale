package Game;

/**
 * The type Baby dragon.
 */
public class BabyDragon extends Soldier{
    /**
     * Instantiates a new Baby dragon.
     */
    public BabyDragon() {
        speed=Speed.FAST;
        target=Target.AIR_GROUND;
        HitSpeed=1800;
        Range=3;
        AreaSplash=true;
        Count=1;
        cost=4;
        setCardName("BabyDragon");
    }

    @Override
    public String toString() {
        return "BabyDragon{" +
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
