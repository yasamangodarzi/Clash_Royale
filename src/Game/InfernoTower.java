package Game;

public class InfernoTower extends Building{
    private int highDamage;
    public InfernoTower() {
        HitSpeed=400;
        target=Target.AIR_GROUND;
        Range=6;
        lifeTime=40000;
        cost=5;
        setCardName("InfernoTower");
    }

    public void setHighDamage(int highDamage) {
        this.highDamage = highDamage;
    }

    @Override
    public String toString() {
        return "InfernoTower{" +
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
