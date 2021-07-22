package sample;

import Game.*;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.time.LocalTime;
import java.util.*;

/**
 * The type Controller.
 */
public class Controller {
    /**
     * The Determine hand cards.
     */
    public DetermineHandCards determineHandCards;
    /**
     * The Determine hand cards robat.
     */
    public DetermineHandCards determineHandCardsRobat;
    /**
     * The Map.
     */
    public HashMap<Image,String> map;

    @FXML
    private ImageView im1;

    @FXML
    private ImageView im2;

    @FXML
    private ImageView im3;

    @FXML
    private ImageView im4;

    @FXML
    private Label exilir;
    @FXML
    private ClashRoyaleView clashRoyaleView;

    @FXML
    private Label time;
    private boolean game;

    /**
     * Select.
     *
     * @param event the event
     */
    @FXML
    void select(MouseEvent event) {
        ImageView imageView=(ImageView)event.getPickResult().getIntersectedNode();
        Image image=imageView.getImage();
        String s=map.get(image);
        int row= (int) event.getX();
        int clounm= (int) event.getY();
        if (row<= 18*Main.gameManagement.getRangePlayer1() &&
            clounm<= 23*Main.gameManagement.getRangePlayer1())
        {
            Main.gameManagement.addCard(getCard(s),1,row,clounm);
            Main.playercurent.card1 = determineHandCards.CreatOneCard(Main.playercurent.card1,Main.playercurent.existCard,getCard(s));
        }

    }

    /**
     * Play.
     *
     * @param event the event
     */
    @FXML
    void Play(MouseEvent event) {

        game=true;
          startTime();
          Main.playercurent.card1=determineHandCards.DeterminingTheEndOfTheCards(Main.gameManagement.getExlixirPlayer1()
                  ,Main.gameManagement.getPlayer1CardList());
          Main.playerRobat.card1=determineHandCards.DeterminingTheEndOfTheCards(Main.gameManagement.getExlixirplayer2()
                  ,Main.gameManagement.getPlayer2CardList());
          Main.gameManagement.StartGame(Main.playercurent,Main.playerRobat);
          Thread thread=new Thread(new Runnable() {
              public void run() {
                  Platform.runLater(new Runnable() {
                      public void run() {
                          clashRoyaleView.update();
                      }
                  });
              }
          });
          // robat play
         Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            public void run() {
                Platform.runLater(new Runnable() {
                    public void run() {
                        playRobat();
                    }
                });
            }
        };

         timer.schedule(timerTask, 0, 100000);
    }

    /**
     * Stop.
     *
     * @param event the event
     */
    @FXML
    void Stop(MouseEvent event) {
       game=false;
    }

    /**
     * Start time.
     */
    public void startTime()
    {
        Date date = new Date();
        String strDate = date.toString();
        String[] strDateSplit = strDate.split(" ");
        String strTime = strDateSplit[3];
        String[] strDetails = strTime.split(":");
        int hour = Integer.parseInt(strDetails[0]);
        int minute = Integer.parseInt(strDetails[1]);
        int second = Integer.parseInt(strDetails[2]);
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            LocalTime currentTime = LocalTime.now();
            if (minute + 2 <= currentTime.getMinute() && second <= currentTime.getSecond() ||
                    minute + 3 == currentTime.getMinute() && second >= currentTime.getSecond()) {
                time.setTextFill(Color.RED);
                time.setText(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
            } else {
                time.setTextFill(Color.GREEN);
                time.setText(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
            }
        }),
                new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Animation.INDEFINITE);
        if (game)
        {
            clock.play();
        }else
        {
            clock.stop();
        }

    }

    /**
     * Sets map.
     */
    public void setMap()
    {
        Image ValkyrieCard=new Image(getClass().getResourceAsStream("/sample/v.png"));
        map.put(ValkyrieCard,"Valkyrie");
        Image InfernoTowerCard=new Image(getClass().getResourceAsStream("/sample/result.png"));
        map.put(InfernoTowerCard,"InfernoTower");
        Image RageCard=new Image(getClass().getResourceAsStream("/sample/rage.png"));
        map.put(RageCard,"Rage");
        Image PEKKACard =new Image(getClass().getResourceAsStream("/sample/MiniPEKKACard.png"));
        map.put(PEKKACard,"PEKKA");
        Image WizardCard =new Image(getClass().getResourceAsStream("/sample/images-removebg-preview.png"));
        map.put(WizardCard,"Wizard");
        Image GiantCard =new Image(getClass().getResourceAsStream("/sample/GiantCard.png"));
        map.put(GiantCard,"Giant");
        Image CannonCard=new Image(getClass().getResourceAsStream("/sample/CannonCard.png"));
        map.put(CannonCard,"Cannon");
        Image BarbariansCard=new Image(getClass().getResourceAsStream("/sample/BarbariansCard.png"));
        map.put(BarbariansCard,"Barbarians");
        Image BabyDragonCard=new Image(getClass().getResourceAsStream("/sample/baby-dragon.png"));
        map.put(BabyDragonCard,"BabyDragon");
        Image ArcherCard=new Image(getClass().getResourceAsStream("/sample/archers.png"));
        map.put(ArcherCard,"Archer");
        Image ArrowsCard=new Image(getClass().getResourceAsStream("/sample/ArrowsCard.png"));
        map.put(ArrowsCard,"Arrows");
        Image FireBallCard=new Image(getClass().getResourceAsStream("/sample/FireballCard.png"));
        map.put(FireBallCard,"FireBall");

    }

    /**
     * Gets card.
     *
     * @param s the s
     * @return the card
     */
    public Card getCard(String s)
    {
        Card card=new Card();
        if (s.equalsIgnoreCase("Archer")){ return card=new Archer();}
        if (s.equalsIgnoreCase("FireBall")){ return card=new FireBall();}
        if (s.equalsIgnoreCase("Arrows")){ return card=new Arrows();}
        if (s.equalsIgnoreCase("Cannon")){ return card=new Cannon();}
        if (s.equalsIgnoreCase("BabyDragon")){ return card=new BabyDragon();}
        if (s.equalsIgnoreCase("Giant")){ return card=new Giant();}
        if (s.equalsIgnoreCase("Wizard")){ return card=new Wizard();}
        if (s.equalsIgnoreCase("Valkyrie")){ return card=new Valkyrie();}
        if (s.equalsIgnoreCase("PEKKA")){ return card=new PEKKA();}
        if (s.equalsIgnoreCase("Rage")){ return card=new Rage();}
        if (s.equalsIgnoreCase("InfernoTower")){ return card=new InfernoTower();}
        if (s.equalsIgnoreCase("Barbarians")){ return card=new Barbarians();}
        return card;
    }

    /**
     * Play robat.
     */
    public void playRobat()
    {
          Main.playerRobat.Play();
    }
}
