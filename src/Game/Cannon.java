package Game;

/**
 * The type Cannon.
 */
public class Cannon extends Building{
    /**
     * Instantiates a new Cannon.
     */
    public Cannon() {
        HitSpeed=800;
        target=Target.GROUND;
        Range=5.5;
        lifeTime=30000;
        cost=6;
        setCardName("Cannon");
    }

    @Override
    public String toString() {
        return "Cannon{" +
                "lifeTime=" + lifeTime +
                ", cost=" + cost +
                ", Range=" + Range +
                ", Damage=" + Damage +
                ", HP=" + HP +
                ", OpponentCard=" + OpponentCard +
                ", HitSpeed=" + HitSpeed +
                ", alive=" + alive +
                ", target=" + target +
                ", speed=" + speed +
                '}';
    }
}
