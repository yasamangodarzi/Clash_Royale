package Game;

public class Cannon extends Building{
    public Cannon() {
        HitSpeed=0.8;
        target=Target.GROUND;
        //range
        lifeTime=30;
        cost=6;
        setCardName("Cannon");
    }
}
