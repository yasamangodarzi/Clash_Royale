package Game;

import java.util.HashMap;

public class KingTower extends Tower{
     private HashMap<Integer,Integer> Hplevel=new HashMap<>();
     private int level;
    private long timefirst=0;
    private boolean CanShoot=false;
    public KingTower(int level) {
        Hplevel.put(1,2400);
        Hplevel.put(2,2568);
        Hplevel.put(3,2736);
        Hplevel.put(4,2094);
        Hplevel.put(5,3096);
          this.level=level;
         Range=7;
        HitSpeed=1000;
    }
    @Override
    public void doAction(long milisecond) {
        CheckCanShoot();
        int i=0;
        if (CanShoot)
        {
            if (milisecond-timefirst==HitSpeed)
            {
                if (OpponentCard.size()>0)
                {
                    if (OpponentCard.get(i).alive)
                    {
                        System.out.println(OpponentCard.get(i).toString());
                        System.out.println("before"+OpponentCard.get(i).HP);
                        shoot(OpponentCard.get(i));
                        System.out.println("after"+OpponentCard.get(i).HP);

                    }else {i++;}
                }
            }

        }

    }

    public void setCanShoot(boolean canShoot) {
        CanShoot = canShoot;
    }
    public void CheckCanShoot() {
          if(HP<Hplevel.get(level)){

              CanShoot=true;

          }
    }
}
