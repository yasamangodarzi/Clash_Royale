package Game;

public class Cannon extends Building{
    public Cannon() {
        HitSpeed=800;
        target=Target.GROUND;
        //range
        lifeTime=30;
        cost=6;
        setCardName("Cannon");
    }
}
