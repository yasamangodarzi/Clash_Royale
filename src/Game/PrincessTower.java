package Game;

public class PrincessTower extends Tower{
    public PrincessTower() {
        HitSpeed=0.8;
        Range=7.5;
    }
//method
//    public void DamageSet(){
//        LevelGameDamage.put(1, 50);
//        LevelGameDamage.put(2, 54);
//        LevelGameDamage.put(3, 58);
//        LevelGameDamage.put(4, 62);
//        LevelGameDamage.put(5, 69);
//    }
//    @Override
//    public int DamageLevel(int GameLevel) {
//        DamageSet();
//        return LevelGameDamage.get(GameLevel);
//    }
//
//
//    public void HPSet(){
//        LevelGameHP.put(1, 1400);
//        LevelGameHP.put(2, 1512);
//        LevelGameHP.put(3, 1624);
//        LevelGameHP.put(4, 1750);
//        LevelGameHP.put(5, 1890);
//    }
//    @Override
//    public int HpLevel(int GameLevel) {
//        HPSet();
//        return LevelGameHP.get(GameLevel);
//    }

    public void doAction() {
        int i=0;
        if (OpponentCard.size()>0)
        {
            if (OpponentCard.get(i).alive)
            {
                shoot(OpponentCard.get(i));
            }else {i++;}
        }
    }
    public void shoot(Card card)
    {
        card.HP-=this.Damage;
    }
}
