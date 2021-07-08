package Game;

public class GameManagement {
    Level level=new Level();
   private Elixir elixir=new Elixir();
   public Player player1 ;
   public Player player2 ;

    public GameManagement(Player player1) {
         this.player1=player1;
         level.SetCard(player1.existCard, player1.level());
         level.SetTower(player1.towers, player1.level());

    }


    public void gameManagement(){
        long start = System.currentTimeMillis();
        int Different = 0;
        while(Different != 180){
            // Game Management
            //...

            long end = System.currentTimeMillis();
            long dif = end - start;
            Different = (int) (dif * (0.001));
            if (Different/2==0){elixir.Change(true);}
            if(Different == 120){
                if (Different/2==0){elixir.Change(false);}

            }
        }
        //System.out.println("Check out the game");
    }

}
