package Game;

import java.util.ArrayList;

public class Spell extends Card{
   protected double Duration;
    protected double Radius;
    protected ArrayList<Location> area;
    protected  ArrayList<Playground> rival;
    public Spell(){
        speed = Speed.MEDIUM;
    }
    public void findArea()
    {
       int CenterRow=location.getRow();
       int CenterColumn= location.getColumn();
       int i= (int) (CenterRow-Radius);
       int t= (int) (CenterColumn+Radius);
       while (true)
       {
           if (i>=0)
           {
               break;
           }
           i++;
       }  while (true)
       {
           if (t>=0)
           {
               break;
           }
           t++;
       }
       for (int j=1;j<=Radius *2 ;j++)
       {
           for (int y=1;y<=Radius*2;y++)
           {
               if (check(i,t))
               {
                   Location location=new Location();
                   location.setRow(i);
                   location.setColumn(t);
                   area.add(location);
               }
               i=i+y;
           }
          t=t+j;
       }

    }

    public void doActionSpell(ArrayList<Playground> playgrounds)
    {
        findArea();
        LookUp(playgrounds);


    }
    public boolean check(int row,int column)
    {
        if (row<0 && row >18)
        {
            return false;
        }
        if (column<0 && column>23)
        {
            return false;
        }
        return true;
    }
    public void LookUp(ArrayList<Playground> playgrounds)
    {
        for (Playground p:playgrounds) {
            Location location=p.getLocation();
            for (Location l:area) {
                if (location.getRow() == l.getRow() && location.getColumn()== l.getColumn())
                {
                   if(this instanceof Rage)
                   {
                       Thread thread=new Thread(new Runnable() {
                           @Override
                           public void run() {
                               long StartTime = System.nanoTime();
                               long TimeElapsed = 0;
                               Increase(p);
                               while(TimeElapsed != Duration) {
                                   long EndTime = System.nanoTime();
                                   TimeElapsed = (EndTime - StartTime) / 1000000;
                               }
                               Dicrease(p);
                           }
                       });
                       thread.start();
                   }else  if (this instanceof Arrows || this instanceof FireBall)
                   {
                       Damage(p);
                   }
                }
            }
        }
    }
    public void Damage(Playground p)
    {
         p.HP-=Damage;
    }
    public void Increase(Playground p)
    {
         p.Damage+=Damage*0.4;
         p.HitSpeed+=HitSpeed*0.4;
         if (p.speed.equals(Speed.SLOW))
         {
             p.speed=Speed.MEDIUM;
         }
         if (p.speed.equals(Speed.MEDIUM))
         {
             p.speed=Speed.FAST;
         } if (p.speed.equals(Speed.FAST))
         {
             p.speed=Speed.VERYFAST;
         }
    }
    public void Dicrease(Playground p)
    {
         p.Damage-=Damage*0.4;
         p.HitSpeed-=HitSpeed*0.4;
         if (p.speed.equals(Speed.VERYFAST))
         {
             p.speed=Speed.FAST;
         }
         if (p.speed.equals(Speed.FAST))
         {
             p.speed=Speed.MEDIUM;
         } if (p.speed.equals(Speed.MEDIUM))
         {
             p.speed=Speed.SLOW;
         }
    }
}
