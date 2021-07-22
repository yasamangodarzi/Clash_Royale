package Game;

/**
 * The type Inferno tower.
 */
public class InfernoTower extends Building{
    private int highDamage;

    /**
     * Instantiates a new Inferno tower.
     */
    public InfernoTower() {
        HitSpeed=400;
        target=Target.AIR_GROUND;
        Range=6;
        lifeTime=40000;
        cost=5;
        setCardName("InfernoTower");
    }

    /**
     * Sets high damage.
     *
     * @param highDamage the high damage
     */
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

    /**
     * Increse damage.
     *
     * @param playground the playground
     */
    public void increseDamage(Playground playground)
    {
        if (CalculateRange(playground)<=6 && CalculateRange(playground)>5){Damage=Damage;}
        if (CalculateRange(playground)<=5 && CalculateRange(playground)>4){Damage+=50;}
        if (CalculateRange(playground)<=4 && CalculateRange(playground)>3){Damage+=100;}
        if (CalculateRange(playground)<=3 && CalculateRange(playground)>2){Damage+=100;}
        if (CalculateRange(playground)<=2 && CalculateRange(playground)>1){Damage+=50;}
        if (CalculateRange(playground)<= 1){Damage=highDamage;}

    }

    /**
     * Calculate range double.
     *
     * @param playground the playground
     * @return the double
     */
    public double CalculateRange(Playground playground)
    {
        int RowOrigin = playground.location.getRow();
        int ColumnOrigin = playground.location.getColumn();
        double distanceRes = 0;
        double ResultRowDifference = Math.pow((this.getLocation().getRow() - RowOrigin), 2);
        double ResultColumnDifference = Math.pow((this.getLocation().getColumn()- ColumnOrigin), 2);
        double distance = Math.sqrt(((int) ResultRowDifference + (int) ResultColumnDifference));
        return distance;
    }
}
