package Game;

import sample.GameHandler;

public class Main {

    public static void main(String[] args) {
//        GameHandler gameHandler=new GameHandler();
        Player player=new Player("yas");
        Player player2=new Player("mary");
        GameManagement gameManagement=new GameManagement( );
////        player.setXp(300);
        for (Card c: player.existCard
        ) {
            System.out.println(c.toString());
        }

         gameManagement.setGameManagement(player,player2);
////        System.out.println(player.existCard.size());
        for (Card c: gameManagement.getPlayer1().existCard
             ) {
            System.out.println(c.toString());
        }
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
        Field field=new Field();
        field.show();
        field.Change(2,12,6);

	// write your code here
    }
}
