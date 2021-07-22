package Game;

/**
 * The type Rage.
 */
public class Rage extends Spell{

    /**
     * Instantiates a new Rage.
     */
    public Rage() {
        setCardName("rage");
        cost=3;
        Radius=5;

    }
    @Override
    public String toString() {
        return "Rage{" +
                "cost=" + cost +
                ", Range=" + Range +
                ", Damage=" + Damage +
                ", Radius=" + Radius +
                ", Duration=" + Duration +
                '}';
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public double getDuration() {
        return Duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(double duration) {
        Duration = duration;
    }
}
