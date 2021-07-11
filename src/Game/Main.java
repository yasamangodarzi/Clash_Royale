package Game;

import sample.GameHandler;

public class Main {

    public static void main(String[] args) {
        GameHandler gameHandler=new GameHandler();
//        Player player=new Player("yas");
//        player.setXp(300);
//        GameManagement gameManagement=new GameManagement(player);
//        System.out.println(player.existCard.size());
        for (Card c: gameHandler.getPlayer().existCard
             ) {
            System.out.println(c.toString());
        }

System.out.println(gameHandler.getPlayer().existCard.size());
gameHandler.addCard("Giant");
gameHandler.addCard("fireball");
        System.out.println(gameHandler.getPlayer().existCard.get(8).toString());
        System.out.println(gameHandler.getPlayer().existCard.get(9).toString());
        System.out.println(gameHandler.player.getLevel());
        gameHandler.removeCard("barbarians");
         gameHandler.show();
         System.out.println();
        for (Card f:gameHandler.player.existCard
             ) {
            System.out.println(f.toString());
        }

	// write your code here
    }
}
