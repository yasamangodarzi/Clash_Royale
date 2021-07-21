package Game;

import sample.GameHandler;

public class Main {

    public static void main(String[] args) {
//        GameHandler gameHandler=new GameHandler();
        Player player=new Player("yas");
        player.setXp(300);
        //System.out.println(player.level());
     //  KingTower kingTower= (KingTower) player.towers.get(0);
      // kingTower.CheckCanShoot();
        Player player2=new Player("mary");
        //PrincessTower princessTower=new PrincessTower();

        GameManagement gameManagement=new GameManagement( );
////        player.setXp(300);
//        for (Tower c: player.towers
//        ) {
//            System.out.println(c.toString());
//        }
//        for (Card c: player.existCard
//        ) {
//            System.out.println(c.toString());
//        }
//        System.out.println( "-----------------");
        gameManagement.setGameManagement(player,player2);
        Barbarians barbarians=new Barbarians();
        Archer archer=new Archer();
        PEKKA pekka=new PEKKA();
        pekka.HP=100;
        pekka.alive=true;
        archer.HP=300;
        archer.alive=true;
        Cannon cannon=new Cannon();
        cannon.HP=300;
        cannon.alive=true;
        Giant giant=new Giant();
//        giant.alive=true;
//        giant.HP=100;
        BabyDragon babyDragon=new BabyDragon();
        babyDragon.HP=100;
        babyDragon.alive=true;
        InfernoTower infernoTower=new InfernoTower();
       barbarians.OpponentCard.add(pekka);
//       babyDragon.OpponentCard.add(archer);
//       babyDragon.OpponentCard.add(pekka);
        gameManagement.addCard(barbarians,1,12,14);

       // gameManagement.addCard(player.existCard.get(3),1,13,2);
////        System.out.println(player.existCard.size());
//        for (Card c: gameManagement.CardPlayer1
//             ) {
//            System.out.println(c.toString());
//        }
//        for (Tower c: player.towers
//        ) {
//            System.out.println(c.toString());
//        }
//        System.out.println(gameManagement.Player1.get(2).OpponentCard);
//
//        System.out.println(gameManagement.Player1.get(2).OpponentCard);
         gameManagement.StartGame(player,player2);
//
//System.out.println(gameHandler.getPlayer().existCard.size());
//gameHandler.addCard("Giant");
//gameHandler.addCard("fireball");
//        System.out.println(gameHandler.getPlayer().existCard.get(8).toString());
//        System.out.println(gameHandler.getPlayer().existCard.get(9).toString());
//        System.out.println(gameHandler.player.getLevel());
//        gameHandler.removeCard("barbarians");
//         gameHandler.show();
//         System.out.println();
//        for (Card f:gameHandler.player.existCard
//             ) {
//            System.out.println(f.toString());
//        }

	// write your code here
    }
}
