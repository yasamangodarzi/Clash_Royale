package Game;

public class Rage extends Spell{

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

    public double getDuration() {
        return Duration;
    }

    public void setDuration(double duration) {
        Duration = duration;
    }
}
