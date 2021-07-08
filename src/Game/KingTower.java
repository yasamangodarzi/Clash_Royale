package Game;

public class KingTower extends Tower{
    public KingTower() {
        //range
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
}
