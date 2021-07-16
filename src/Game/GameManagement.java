package Game;

import java.util.ArrayList;

public class GameManagement {
    Level level=new Level();
    private Elixir elixirPlayer1=new Elixir();
    private Elixir elixirPlayer2=new Elixir();
    private Player player1 ;
    private Player player2 ;
    public Field field=new Field();
    public ArrayList<Card> InGameCards=new ArrayList<>();

    public void setGameManagement(Player player1,Player player2) {
        this.player1=player1;
        this.player2=player2;
        level.SetCard(player1.existCard, player1.level());
        level.SetTower(player1.towers, player1.level());
        level.SetCard(player2.existCard, player1.level());
        level.SetTower(player2.towers, player1.level());

    }


    public void gameManagement(){

        long startTime = System.nanoTime();
        int Different = 0;
        long timeElapsed = 0;
        while(timeElapsed != 180000){
            // Game Management
            //...


            long endTime = System.nanoTime();
            timeElapsed = (endTime - startTime) / 1000000;
            Different = (int)timeElapsed / 1000;
            if(Different/2==0){elixirPlayer1.Change(true);}
            if(timeElapsed == 120000){
                if (Different/2==0){elixirPlayer2.Change(false);}

            }
        }
        //System.out.println("Check out the game");
    }

}
