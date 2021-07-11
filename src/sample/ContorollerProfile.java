/**
 * Sample Skeleton for 'Profile.fxml' Controller Class
 */

package sample;

import Game.Card;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class ContorollerProfile {

    @FXML // fx:id="cardShow"
    private ImageView cardShow; // Value injected by FXMLLoader

    @FXML // fx:id="card1"
    private Label card1; // Value injected by FXMLLoader

    @FXML // fx:id="card2"
    private Label card2; // Value injected by FXMLLoader

    @FXML // fx:id="card3"
    private Label card3; // Value injected by FXMLLoader

    @FXML // fx:id="card4"
    private Label card4; // Value injected by FXMLLoader

    @FXML // fx:id="card5"
    private Label card5; // Value injected by FXMLLoader

    @FXML // fx:id="card8"
    private Label card8; // Value injected by FXMLLoader

    @FXML // fx:id="card7"
    private Label card7; // Value injected by FXMLLoader

    @FXML // fx:id="card6"
    private Label card6; // Value injected by FXMLLoader

    @FXML // fx:id="king"
    private ImageView king; // Value injected by FXMLLoader

    @FXML // fx:id="Usrname"
    private Label Usrname; // Value injected by FXMLLoader

    @FXML // fx:id="card61"
    private Label card61; // Value injected by FXMLLoader

    @FXML // fx:id="Socer"
    private Label Socer; // Value injected by FXMLLoader

    @FXML // fx:id="Socer1"
    private Label Level; // Value injected by FXMLLoader

    @FXML // fx:id="Backimage"
    private ImageView Backimage; // Value injected by FXMLLoader

    @FXML
    void Back(MouseEvent event) {
        Socer.setText("");
        Usrname.setText("");
        Level.setText("");
        card1.setText("");
        card2.setText("");
        card3.setText( "");
        card4.setText( "");
        card5.setText("");
        card6.setText("");
        card7.setText("");
        card8.setText("");

      Main.set(2);
    }

    @FXML
    void ShowCard(MouseEvent event) {
        ArrayList<Card> cards=  Main.gameHandler.player.existCard;
        card1.setText(cards.get(0).getCardName());
        card2.setText(cards.get(1).getCardName());
        card3.setText(cards.get(2).getCardName());
        card4.setText(cards.get(3).getCardName());
        card5.setText(cards.get(4).getCardName());
        card6.setText(cards.get(5).getCardName());
        card7.setText(cards.get(6).getCardName());
        card8.setText(cards.get(7).getCardName());

    }

    @FXML
    void ShowInformation(MouseEvent event) {
        int socer=Main.gameHandler.player.getXp();
        Socer.setText(String.valueOf(socer));
        Usrname.setText(Main.gameHandler.player.getUsername());
        Level.setText(String.valueOf(Main.gameHandler.player.getLevel()));


    }

}
