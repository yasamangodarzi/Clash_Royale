package sample;

import Game.*;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.Iterator;

public class GameHandler {
    public ArrayList<Card> cards=new ArrayList<>();

    public Player player=new Player("Yas");
    public Level level=new Level();

    public GameHandler() {
        player.setXp(300);
        level.SetCard(player.existCard, player.level());
        level.SetTower(player.towers, player.level());
    }

    public   Player getPlayer() {
        return player;
    }

    public   void setPlayer(Player plyer) {
       this.player = plyer;
    }
    public void removeCard(String string)
    {
         Iterator<Card> iterator= player.existCard.iterator();
         while (iterator.hasNext()) {
             Card loan = iterator.next();
             if (loan.getCardName().equalsIgnoreCase(string)) {
                 iterator.remove();
             }

         }
    }
    public  void addCard(String s)
    {
        if (s .equalsIgnoreCase("giant")){
            Card card=new Giant();
            cards.add(card);
            player.existCard.add(card);level.SetCard(cards,player.getLevel());
        cards.remove(card);
        }
        if (s .equalsIgnoreCase("Valkyrie")){
            Card card=new Valkyrie();
            cards.add(card);
            player.existCard.add(card);level.SetCard(cards,player.getLevel());
            cards.remove(card);
        }
        if (s .equalsIgnoreCase("babydragon")){
            Card card=new BabyDragon();
            cards.add(card);
            player.existCard.add(card);level.SetCard(cards,player.getLevel());
            cards.remove(card);
        }
        if (s.equalsIgnoreCase("pekka")){
            Card card=new PEKKA();
            cards.add(card);
            player.existCard.add(card);level.SetCard(cards,player.getLevel());
            cards.remove(card);
        }
        if (s.equalsIgnoreCase("wizard")){
            Card card=new Wizard();
            cards.add(card);
            player.existCard.add(card);level.SetCard(cards,player.getLevel());
            cards.remove(card);
        }
        if (s.equalsIgnoreCase("barbarians")){
            Card card=new Barbarians();
            cards.add(card);
            player.existCard.add(card);level.SetCard(cards,player.getLevel());
            cards.remove(card);
        }
        if (s .equalsIgnoreCase("fireball")){
            Card card=new FireBall();
            cards.add(card);
            player.existCard.add(card);level.SetCard(cards,player.getLevel());
            cards.remove(card);
        }
        if (s .equalsIgnoreCase("arrows")){
            Card card=new Arrows();
            cards.add(card);
            player.existCard.add(card);level.SetCard(cards,player.getLevel());
            cards.remove(card);
        }
        if (s .equalsIgnoreCase("rage")){
            Card card=new Rage();
            cards.add(card);
            player.existCard.add(card);level.SetCard(cards,player.getLevel());
            cards.remove(card);
        }
        if (s .equalsIgnoreCase("archer")){
            Card card=new Archer();
            cards.add(card);
            player.existCard.add(card);level.SetCard(cards,player.getLevel());
            cards.remove(card);
        }
        if (s .equalsIgnoreCase("Cannon")){
            Card card=new Cannon();
            cards.add(card);
            player.existCard.add(card);level.SetCard(cards,player.getLevel());
            cards.remove(card);
        }
        if (s .equalsIgnoreCase("InfernoTower")){
            Card card=new InfernoTower();
            cards.add(card);
            player.existCard.add(card);level.SetCard(cards,player.getLevel());
            cards.remove(card);
        }
    }
    public void show()
    {
        for (Card c: player.existCard) {
            System.out.println(c.toString());
        }
    }
    public void showPlayer()
    {
        System.out.println(player.toString());
    }
}
