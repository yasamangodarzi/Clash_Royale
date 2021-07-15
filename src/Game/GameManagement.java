package Game;

import java.util.ArrayList;
import java.util.Iterator;

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
    public void StartGame(){
        long start = System.currentTimeMillis();
        int Different = 0;
        while(Different != 180){
            //The first 2 minutes of the game

            for (Card c:InGameCards) {
                if (c.alive)
                {
                    c.doAction();
                }
            }
           // player2.towers.get(0).OpponentCard=player2.towers.get(0).DetectProximityTargetCard
            long end = System.currentTimeMillis();
            long dif = end - start;
            Different = (int) (dif * (0.001));
            if (Different/2==0){
                elixirPlayer1.Change(true);
                elixirPlayer2.Change(true);
            }
            if(Different == 120){
                // 1 last minute of the game
                for (Card c:InGameCards) {
                    if (c.alive)
                    {
                        c.doAction();
                    }

                }

                if (Different/2==0){
                    elixirPlayer1.Change(false);
                    elixirPlayer2.Change(false);
                }

            }
        }
        //System.out.println("Check out the game");
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
    public void addCard(Card card, int a)
    {
        ArrayList<Card>cards=new ArrayList<>();
        cards.add(card);
        if (a==1)
        {
            level.SetCard(cards, player1.getLevel());
        }else
        {
            level.SetCard(cards, player2.getLevel());
        }

        InGameCards.add(card);
    }
    public void Checkalive()
    {
        Card removeCard=new Card();
        for (Card c:InGameCards) {
            if (!(c.alive))
            {
               removeCard=c;
            }

        }
        Iterator iterator=InGameCards.iterator();
        Card card;
        while (iterator.hasNext()) {
            card = (Card) iterator.next();
            if (card.equals(removeCard)) {
                iterator.remove();
                break;
            }
        }
    }
}
