package Game;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * The type Game management.
 */
public class GameManagement {
    private HashMap<Elixir,Player> elixirPlayerHashMap=new HashMap<>();
    private Level level=new Level();
    private Elixir elixirPlayer1=new Elixir();
    private Elixir elixirPlayer2=new Elixir();
    private Player player1 ;
    private Player player2 ;
    /**
     * The Field.
     */
    public Field field=new Field();
    /**
     * The In game cards.
     */
    public ArrayList<Card> InGameCards=new ArrayList<>();
    /**
     * The Card player 1.
     */
    public ArrayList<Card> CardPlayer1=new ArrayList<>();
    /**
     * The Player 1.
     */
    public ArrayList<Playground>  Player1=new ArrayList<>();
    /**
     * The Player 1 tower.
     */
    public ArrayList<Tower>  Player1Tower=new ArrayList<>();
    /**
     * The Player 2 tower.
     */
    public ArrayList<Tower>  Player2Tower=new ArrayList<>();
    /**
     * The Card player 2.
     */
    public ArrayList<Card> CardPlayer2=new ArrayList<>();
    /**
     * The Player 2.
     */
    public ArrayList<Playground>  Player2=new ArrayList<>();
    /**
     * The Loser.
     */
    public String loser = "";
    /**
     * The Win.
     */
    public String win = "";
    private boolean King1Alive=true;
   private boolean King2Alive=true;
   private  int hpPlayer1=0;
   private  int hpPlayer2=0;
   private boolean first=true;
   private double RangePlayer1=0.5;
   private double RangePlayer2=0.5;


    /**
     * Sets game management.
     *
     * @param player1 the player 1
     * @param player2 the player 2
     */
    public void setGameManagement(Player player1,Player player2) {
        this.player1=player1;
        this.player2=player2;
        level.SetCard(player1.existCard, player1.level());
        level.SetTower(player1.towers, player1.level());
        level.SetCard(player2.existCard, player1.level());
        level.SetTower(player2.towers, player1.level());
        elixirPlayerHashMap.put(elixirPlayer1,player1);
        elixirPlayerHashMap.put(elixirPlayer2,player2);
        for (Tower t: player1.towers) {t.alive=true; Player1.add(t); Player1Tower.add(t);}
        for (Tower t: player2.towers) {t.alive=true; Player2.add(t);Player2Tower.add(t);}

    }


    /**
     * Start game.
     *
     * @param player1 the player 1
     * @param player2 the player 2
     */
    public void StartGame(Player player1,Player player2){
         setGameManagement(player1, player2);
        System.out.println("set");

        long startTime = System.nanoTime();
        int Different = 0;
        long timeElapsed = 0;
        while(timeElapsed != 180000 ){
            if (CheckEndGame())
            {
                CheckPrincessTowerDie();
                changeRange();
                //The first 2 minutes of the game
                for (Playground c:Player1) {
                    if (c instanceof Spell)
                    {
                        if (c instanceof Rage)
                        {
                            ((Rage) c).doActionSpell(Player1);

                        }
                        else
                        {
                            ((Spell) c).doActionSpell(Player2);
                        }
                        c.alive=false;
                    }
                    else if (c.HP>0)
                    {
                        c.doAction(timeElapsed);
                        c.OpponentCard=c.DetectProximityTargetCard(c.getLocation().getRow(),c.getLocation().getColumn(),
                               Player2,c.Range);

                    }
                    else
                    {
                        c.alive=false;
                    }
                }
                for (Playground c:Player2) {
                    if (c instanceof Spell)
                    {
                        if (c instanceof Rage)
                        {
                            ((Rage) c).doActionSpell(Player2);
                        }
                        else
                        {
                            ((Spell) c).doActionSpell(Player1);
                        }
                        c.alive=false;
                    }
                    else if (c.HP>0)
                    {
                        c.doAction(timeElapsed);
                         c.OpponentCard=c.DetectProximityTargetCard(c.getLocation().getRow(),c.getLocation().getColumn(),
                                 Player1,c.Range);
                    }
                    else{
                        c.alive=false;
                    }
                }
                long endTime = System.nanoTime();
                timeElapsed = (endTime - startTime) / 1000000;
                Different = (int)timeElapsed / 100000000;

                if(Different/2==0 && first)
                {

                    elixirPlayer1.Change(true);
                    elixirPlayer2.Change(true);
                    first=false;
                }
                if(timeElapsed == 120000){
                    if (Different/2==0)
                    {
                        elixirPlayer1.Change(false);
                        elixirPlayer2.Change(false);
                    }

                }

            }
            else
            {
                if (King1Alive)
                {
                   loser= player2.getUsername();
                   win= player1.getUsername();

                }
                else
                {
                   loser= player1.getUsername();
                   win= player2.getUsername();
                }

                 break;
            }

        }
        if (win.equals("") && loser.equals(""))
        {
            for (Playground p:Player1) {
                if (p.alive && p instanceof Tower && p.HP>0){hpPlayer1+=p.HP;}
            }
            for (Playground p:Player2) {
                if (p.alive && p instanceof Tower && p.HP>0){hpPlayer2+=p.HP;}
            }
            if (hpPlayer1>hpPlayer2)
            {
                loser= player2.getUsername();
                win= player1.getUsername();
            }else
            {
                loser= player1.getUsername();
                win= player2.getUsername();
            }

        }
        boolean resultGame;
        if (win.equalsIgnoreCase(player1.getUsername()))
        {
          resultGame=true;
        }else {resultGame=false;}
        File file=new File(String.valueOf(player1.level()),resultGame,player1.existCard);
        try {
            file.CreatFilePlayer();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (!(player2 instanceof robot))
        {
            File file2=new File(String.valueOf(player2.level()),!resultGame,player2.existCard);
            try {
                file2.CreatFilePlayer();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * Gets player 1.
     *
     * @return the player 1
     */
    public Player getPlayer1() {
        return player1;
    }

    /**
     * Gets player 2.
     *
     * @return the player 2
     */
    public Player getPlayer2() {
        return player2;
    }

    /**
     * Add card.
     *
     * @param card the card
     * @param a    the a
     * @param row  the row
     * @param clo  the clo
     */
    public void addCard(Card card, int a,int row,int clo)
    {
        ArrayList<Card>cards=new ArrayList<>();
        cards.add(card);

        if (a==1)
        {
             level.SetCard(cards, player1.level());
            elixirPlayer1.lowerElixir(card.cost);
            card.alive=true;
           card.getLocation().setRow(row);
           card.getLocation().setColumn(clo);
            CardPlayer1.add(card);
            Player1.add(card);
            if (card instanceof Building)
            {
                 System.out.println("life time start ");
                Thread thread=new Thread(new Runnable() {
                    @Override
                    public void run() {

                        long StartTime = System.nanoTime();
                        long TimeElapsed = 0;
                        while(TimeElapsed != ((Building) card).lifeTime ) {
                            long EndTime = System.nanoTime();
                             TimeElapsed = (EndTime - StartTime) / 1000000;
                        }
                         System.out.println("finish life time");
                        card.alive=false;
                        card.HP=-1;
                        for (Playground p:Player1) {
                            if (p.equals(card))
                            {
                                p.alive=false;
                                p.HP=-1;
                            }
                        }
                    }
                });
                thread.start();
            }
        }else if (a==2){
            level.SetCard(cards, player2.level());
            elixirPlayer2.lowerElixir(card.cost);
            card.alive=true;
            card.getLocation().setRow(row);
            card.getLocation().setColumn(clo);
            CardPlayer2.add(card);
            Player2.add(card);
            if (card instanceof Building)
            {

                Thread thread=new Thread(new Runnable() {
                    @Override
                    public void run() {

                        long StartTime = System.nanoTime();
                        long TimeElapsed = 0;
                        while(TimeElapsed != ((Building) card).lifeTime ) {
                            long EndTime = System.nanoTime();
                            TimeElapsed = (EndTime - StartTime) / 1000000;

                        }
                        card.alive=false;
                        for (Playground p:Player2) {
                                if (p.equals(card))
                                {
                                    p.alive=false;
                                }
                        }
                    }
                });
                thread.start();
            }

        }



        InGameCards.add(card);

    }

    /**
     * Check end game boolean.
     *
     * @return the boolean
     */
    public boolean CheckEndGame()
    {

        for (Playground p:Player1) {
            if (p instanceof KingTower)
            {
                if (!(p.alive)){
                    King1Alive=false;
                    return false;

                }
            }
        }
        for (Playground p:Player2) {
            if (p instanceof KingTower)
            {
                if (!(p.alive)){
                    King2Alive=false;
                    return false;

                }
            }
        }
        if (King1Alive && King2Alive)
        {
            return true;
        }
        return true;
    }

    /**
     * Gets player 1 card list.
     *
     * @return the player 1 card list
     */
    public ArrayList<Card> getPlayer1CardList()
    {

        return player1.existCard;
    }

    /**
     * Gets player 2 card list.
     *
     * @return the player 2 card list
     */
    public ArrayList<Card> getPlayer2CardList()
    {

        return player1.existCard;
    }

    /**
     * Gets exlixir player 1.
     *
     * @return the exlixir player 1
     */
    public int getExlixirPlayer1()
    {
        return elixirPlayer1.getElixir();
    }

    /**
     * Gets exlixirplayer 2.
     *
     * @return the exlixirplayer 2
     */
    public int getExlixirplayer2()
    {
        return elixirPlayer2.getElixir();
    }

    /**
     * Check princess tower die.
     */
    public void CheckPrincessTowerDie()
    {
        boolean king1=false;
        for (Playground t:Player1) {
            if (t.HP<0 && !(t.alive) && t instanceof PrincessTower){
                king1=true;
            }
        }
        if (king1)
        {
            for (Playground t:Player1) {
                if (  t instanceof KingTower){
                    ((KingTower) t).setCanShoot(true);
                }
            }
        }
        boolean king2=false;
        for (Playground t: Player2) {
            if (t.HP<0 && !(t.alive) && t instanceof PrincessTower){
                king2=true;
            }
        }
        if (king2)
        {
            for (Playground t:Player2) {
                if (  t instanceof KingTower){
                    ((KingTower) t).setCanShoot(true);
                }
            }
        }

    }

    /**
     * Change range.
     */
    public void changeRange()
    {
        if (Player1Tower.size()==2)
        {
            RangePlayer1=0.75;
        } if (Player1Tower.size()==1)
        {
            RangePlayer1=0.85;
        }
        if (Player2Tower.size()==2)
        {
            RangePlayer2=0.75;
        } if (Player2Tower.size()==1)
        {
            RangePlayer2=0.85;
        }

    }

    /**
     * Gets range player 1.
     *
     * @return the range player 1
     */
    public double getRangePlayer1() {
        return RangePlayer1;
    }

    /**
     * Gets range player 2.
     *
     * @return the range player 2
     */
    public double getRangePlayer2() {
        return RangePlayer2;
    }
}
