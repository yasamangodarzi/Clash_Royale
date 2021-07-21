package Game;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class Soldier extends Card{
 //    protected Speed speed ;
    protected boolean AreaSplash;
   protected int Count;
   private  long timefirst=0;
   private  long time=0;
//   private boolean shott=false;
//   private boolean move=false;


    public Soldier( ) {

    }

    public void SoldierMove(){

    }
    private Playground playground=new Playground();
    int i=0;


    @Override
    public void doAction(long milsecond)
    {
      if (OpponentCard.size()>0 && checkElementAlive())
      {
           Attack(milsecond);
      }else
      {
          Move(milsecond);
      }
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soldier soldier = (Soldier) o;
        return AreaSplash == soldier.AreaSplash && Count == soldier.Count && timefirst == soldier.timefirst;
    }

    @Override
    public int hashCode() {
        return Objects.hash(AreaSplash, Count, timefirst);
    }

//    public Speed getSpeed() {
//        return speed;
//    }
    public void Move(long milisecond)
    {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (location.getColumn()<23)
            {
                System.out.println("before column"+location.getColumn());
                location.setColumn(location.getColumn()+1);
                System.out.println("after column"+location.getColumn());
                timefirst = milisecond;
                System.out.println("Time" + timefirst);
                System.out.println("mil" + milisecond);
                // location.setRow(location.getRow()+1);
            }
            }
        }, 0, 1000);
//        if (milisecond-time==6000)
//        {
//            if (location.getColumn()<23)
//            {
//                System.out.println("before column"+location.getColumn());
//                location.setColumn(location.getColumn()+1);
//                System.out.println("after column"+location.getColumn());
//                timefirst = milisecond;
//                System.out.println("Time" + timefirst);
//                System.out.println("mil" + milisecond);
//                // location.setRow(location.getRow()+1);
//            }
//
//        }
    }
    public void Attack(long milsecond)
    {
        if (milsecond-timefirst==HitSpeed)
        {
            if (AreaSplash)
            {
                for (Playground p:OpponentCard) {
                    if (p.HP>0) {
                        if (p.alive) {
                            if (!(playground.equals(p))){System.out.println("!");}
                            System.out.println(p.toString());
                            playground=p;
                            if (CheckTarget(p)) {
                                System.out.println("before" +p.HP);
                                shoot(p);
                                System.out.println("after" + p.HP);
                                timefirst = milsecond;
                                System.out.println("Time" + timefirst);
                                System.out.println("mil" + milsecond);
                            }
                        }

                    }
                }

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
    public boolean checkElementAlive()
    {
        boolean alive=false;
        for (Playground p:OpponentCard) {
            if (p.HP>0 &&  p.alive )
            {
                alive=true;
            }
        }
        return alive;
    }
}
