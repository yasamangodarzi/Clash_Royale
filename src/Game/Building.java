package Game;

public class Building extends Card{
     protected int lifeTime;
     private int i=0;
    private long timefirst=0;
    private Playground playground=new Playground();
    public Building(){
        speed = Speed.MEDIUM;
    }
    @Override
    public void doAction(long milsecond) {
        if (milsecond - timefirst == HitSpeed) {
            if (OpponentCard.size() > 0 && OpponentCard.get(i).HP > 0) {
                if (OpponentCard.get(i).alive) {
                    if (!(playground.equals(OpponentCard.get(i)))) {
                        System.out.println("!");
                    }
                    System.out.println(OpponentCard.get(i).toString());
                    playground = OpponentCard.get(i);
                    if (CheckTarget(OpponentCard.get(i))) {
                        System.out.println("before" + OpponentCard.get(i).HP);
                        shoot(OpponentCard.get(i));
                        System.out.println("after" + OpponentCard.get(i).HP);
                        timefirst = milsecond;
                        System.out.println("Time" + timefirst);
                        System.out.println("mil" + milsecond);
                    }
                }

            } else {
                i++;
            }

        }

    }

}
