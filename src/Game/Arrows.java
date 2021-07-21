package Game;

public class Arrows extends Spell{
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
