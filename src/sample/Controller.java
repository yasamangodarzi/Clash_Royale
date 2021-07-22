package sample;

import Game.Card;
import Game.DetermineHandCards;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public class Controller {
      public DetermineHandCards determineHandCards;
      public DetermineHandCards determineHandCardsRobat;
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

    @FXML
    void select(MouseEvent event) {
        ImageView imageView=(ImageView)event.getPickResult().getIntersectedNode();
        Image image=imageView.getImage();

       Card card= determineHandCards.CreatOneCard(Main.playercurent.card1,);
    }
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
    }
    @FXML
    void Stop(MouseEvent event) {
       game=false;
    }
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
    public void setMap()
    {
        //map.put()
    }
}
