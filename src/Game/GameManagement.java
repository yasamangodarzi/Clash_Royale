package Game;

import java.util.ArrayList;
import java.util.HashMap;

public class GameManagement {
    private HashMap<Elixir,Player> elixirPlayerHashMap=new HashMap<>();
    private Level level=new Level();
    private Elixir elixirPlayer1=new Elixir();
    private Elixir elixirPlayer2=new Elixir();
    private Player player1 ;
    private Player player2 ;
    public Field field=new Field();
    public ArrayList<Card> InGameCards=new ArrayList<>();
    public ArrayList<Card> CardPlayer1=new ArrayList<>();
    public ArrayList<Card> CardPlayer2=new ArrayList<>();


    public void setGameManagement(Player player1,Player player2) {
        this.player1=player1;
        this.player2=player2;
        level.SetCard(player1.existCard, player1.level());
        level.SetTower(player1.towers, player1.level());
        level.SetCard(player2.existCard, player1.level());
        level.SetTower(player2.towers, player1.level());
        elixirPlayerHashMap.put(elixirPlayer1,player1);
        elixirPlayerHashMap.put(elixirPlayer2,player2);
        for (Tower t: player1.towers) {t.alive=true;}
        for (Tower t: player2.towers) {t.alive=true;}

    }


    public void gameManagement(Player player1,Player player2){
        setGameManagement(player1, player2);

        long startTime = System.nanoTime();
        int Different = 0;
        long timeElapsed = 0;
        while(timeElapsed != 180000){
            //The first 2 minutes of the game



            long endTime = System.nanoTime();
            timeElapsed = (endTime - startTime) / 1000000;
            Different = (int)timeElapsed / 1000;
            if(Different/2==0)
            {
                elixirPlayer1.Change(true);
                elixirPlayer2.Change(true);
            }
            if(timeElapsed == 120000){
                if (Different/2==0)
                {
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
            CardPlayer1.add(card);
            elixirPlayer1.lowerElixir(card.cost);
            card.alive=true;
        }else if (a==2){
            level.SetCard(cards, player2.getLevel());
            CardPlayer2.add(card);
            elixirPlayer2.lowerElixir(card.cost);
            card.alive=true;
        }

        InGameCards.add(card);
    }

}
