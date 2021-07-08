package Game;

public class Main {

    public static void main(String[] args) {
        Player player=new Player();
        player.setXp(300);
        GameManagement gameManagement=new GameManagement(player);
        for (Card c: player.existCard
             ) {
            System.out.println(c.toString());
        }


	// write your code here
    }
}
