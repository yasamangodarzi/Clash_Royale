package Game;

/**
 * The type Arrows.
 */
public class Arrows extends Spell{
    /**
     * Instantiates a new Arrows.
     */
    public Arrows() {
        setCardName("arrows");
        Radius=4;
        cost=3;
    }
    @Override
    public String toString() {
        return "Arrows{" +
                "cost=" + cost +
                ", Range=" + Range +
                ", Damage=" + Damage +
                ", Radius=" + Radius +
                '}';
    }
}
