package Game;

public class Building extends Card{
     protected int lifeTime;

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public Building(){
        speed = Speed.MEDIUM;
    }
}
