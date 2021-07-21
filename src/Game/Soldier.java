package Game;

public class Soldier extends Card{
 //    protected Speed speed ;
    protected boolean AreaSplash;
   protected int Count;
   private  long timefirst=0;


    public Soldier( ) {

    }

    public void SoldierMove(){

    }
    private Playground playground=new Playground();
    int i=0;


    @Override
    public void doAction(long milsecond)
    {

    if (milsecond-timefirst==HitSpeed)
       {
            if (AreaSplash)
            {

            }else
            {
                if (OpponentCard.size()>0 && OpponentCard.get(i).HP>0) {
                     if (OpponentCard.get(i).alive) {
                         if (!(playground.equals(OpponentCard.get(i)))){System.out.println("!");}
                         System.out.println(OpponentCard.get(i).toString());
                         playground=OpponentCard.get(i);

                         if (CheckTarget(OpponentCard.get(i))) {
                             System.out.println("before" + OpponentCard.get(i).HP);
                             shoot(OpponentCard.get(i));
                             System.out.println("after" + OpponentCard.get(i).HP);
                             timefirst = milsecond;
                             System.out.println("Time" + timefirst);
                             System.out.println("mil" + milsecond);
                         }
                   }

                 }

           }
      }

   }

    public void shoot(Playground card)
    {
        card.HP-=this.Damage;
    }


//    public Speed getSpeed() {
//        return speed;
//    }
}
