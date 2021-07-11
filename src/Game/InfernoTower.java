package Game;

public class InfernoTower extends Building{
    public InfernoTower() {
        HitSpeed=0.4;
        target=Target.AIR_GROUND;
        //range
        lifeTime=40;
        cost=5;
        setCardName("InfernoTower");
    }
}
