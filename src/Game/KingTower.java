package Game;

import java.util.HashMap;

public class KingTower extends Tower{
     private HashMap<Integer,Integer> Hplevel=new HashMap<>();
     private int level;
    private boolean CanShoot=false;
    public KingTower(int level) {
        Hplevel.put(1,2400);
        Hplevel.put(2,2568);
        Hplevel.put(3,2736);
        Hplevel.put(4,2094);
        Hplevel.put(5,3096);
          this.level=level;
         Range=7;
        HitSpeed=1;
    }
    //    //method
//    public void DamageSet(){
//        LevelGameDamage.put(1, 50);
//        LevelGameDamage.put(2, 53);
//        LevelGameDamage.put(3, 57);
//        LevelGameDamage.put(4, 60);
//        LevelGameDamage.put(5, 64);
//    }
//    @Override
//    public int DamageLevel(int GameLevel){
//        DamageSet();
//        return LevelGameDamage.get(GameLevel);
//    }
//
//
//    public void HPSet(){
//        LevelGameHP.put(1, 2400);
//        LevelGameHP.put(2, 2568);
//        LevelGameHP.put(3, 2738);
//        LevelGameHP.put(4, 2904);
//        LevelGameHP.put(5, 3096);
//    }
//    @Override
//    public int HpLevel(int GameLevel){
//        HPSet();
//        return LevelGameHP.get(GameLevel);
//    }
    @Override
    public void doAction() {
        CheckCanShoot();
        int i=0;
        if (CanShoot)
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
    public void shoot(Card card)
    {
        card.HP-=this.Damage;
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
