package Game;

/**
 * The type Fire ball.
 */
public class FireBall extends Spell{
    /**
     * Instantiates a new Fire ball.
     */
    public FireBall() {
        setCardName("fireball");
        Radius=2.5;
        cost=4;
    }

    @Override
    public String toString() {
        return "FireBall{" +
                "cost=" + cost +
                ", Range=" + Range +
                ", Damage=" + Damage +
                ", Radius=" + Radius +
                '}';
    }
}
