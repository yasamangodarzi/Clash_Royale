/**
 * Sample Skeleton for 'BattleDeck.fxml' Controller Class
 */

package sample;

import Game.Card;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.util.ArrayList;

public class ContorollerBattleDeck {
    boolean val=false;
    boolean baby=false;
    boolean barba=false;
    boolean archer=false;
    boolean canon=false;
    boolean inf=false;
    boolean fire=false;
    boolean arr=false;
    boolean wiz=false;
    boolean gaint=false;
    boolean rag=false;
    boolean pk=false;

    @FXML // fx:id="babydragon"
    private ImageView babydragon; // Value injected by FXMLLoader

    @FXML // fx:id="Archer"
    private ImageView Archer; // Value injected by FXMLLoader

    @FXML // fx:id="Gisnt"
    private ImageView Gisnt; // Value injected by FXMLLoader

    @FXML // fx:id="Valkyrie"
    private ImageView Valkyrie; // Value injected by FXMLLoader

    @FXML // fx:id="pekka"
    private ImageView pekka; // Value injected by FXMLLoader

    @FXML // fx:id="Cannon"
    private ImageView Cannon; // Value injected by FXMLLoader

    @FXML // fx:id="barbarians"
    private ImageView barbarians; // Value injected by FXMLLoader

    @FXML // fx:id="wizard"
    private ImageView wizard; // Value injected by FXMLLoader

    @FXML // fx:id="CardShow"
    private Button CardShow; // Value injected by FXMLLoader

    @FXML // fx:id="fireball"
    private ImageView fireball; // Value injected by FXMLLoader

    @FXML // fx:id="rage"
    private ImageView rage; // Value injected by FXMLLoader

    @FXML // fx:id="infernotower"
    private ImageView infernotower; // Value injected by FXMLLoader

    @FXML // fx:id="arrows"
    private ImageView arrows; // Value injected by FXMLLoader

    @FXML // fx:id="card6"
    private Label card6; // Value injected by FXMLLoader

    @FXML // fx:id="card5"
    private Label card5; // Value injected by FXMLLoader

    @FXML // fx:id="card1"
    private Label card1; // Value injected by FXMLLoader

    @FXML // fx:id="card2"
    private Label card2; // Value injected by FXMLLoader

    @FXML // fx:id="card3"
    private Label card3; // Value injected by FXMLLoader

    @FXML // fx:id="card4"
    private Label card4; // Value injected by FXMLLoader

    @FXML // fx:id="card7"
    private Label card7; // Value injected by FXMLLoader

    @FXML // fx:id="card8"
    private Label card8; // Value injected by FXMLLoader

    @FXML // fx:id="Backimage"
    private ImageView Backimage; // Value injected by FXMLLoader

    @FXML // fx:id="Delet1"
    private ImageView Delet1; // Value injected by FXMLLoader

    @FXML // fx:id="question"
    private ImageView question; // Value injected by FXMLLoader

    @FXML // fx:id="Delet2"
    private ImageView Delet2; // Value injected by FXMLLoader

    @FXML // fx:id="Delet3"
    private ImageView Delet3; // Value injected by FXMLLoader

    @FXML // fx:id="Delet4"
    private ImageView Delet4; // Value injected by FXMLLoader

    @FXML // fx:id="Delet8"
    private ImageView Delet8; // Value injected by FXMLLoader

    @FXML // fx:id="Delet7"
    private ImageView Delet7; // Value injected by FXMLLoader

    @FXML // fx:id="Delet6"
    private ImageView Delet6; // Value injected by FXMLLoader

    @FXML // fx:id="Delet5"
    private ImageView Delet5; // Value injected by FXMLLoader
    @FXML // fx:id="result"
    private Label result; // Value injected by FXMLLoader

    @FXML
    void Back(MouseEvent event) {
        Main.set(2);

    }

    @FXML
    void Delet(MouseEvent event) {
        String card="";

    if (event.getPickResult().getIntersectedNode().getId().equalsIgnoreCase("Delet1") )
        {
            card=card1.getText();
            card1.setText("");
        }if (event.getPickResult().getIntersectedNode().getId().equalsIgnoreCase("Delet2") )
        {
              card=card2.getText();
            card2.setText("");
        }if (event.getPickResult().getIntersectedNode().getId().equalsIgnoreCase("Delet3") )
        {
             card=card3.getText();
            card3.setText("");
        }if (event.getPickResult().getIntersectedNode().getId().equalsIgnoreCase("Delet4") )
        {
              card=card4.getText();
            card4.setText("");
        }if (event.getPickResult().getIntersectedNode().getId().equalsIgnoreCase("Delet5") )
        {
             card=card5.getText();
            card5.setText("");
        }if (event.getPickResult().getIntersectedNode().getId().equalsIgnoreCase("Delet6") )
        {
             card=card6.getText();
            card6.setText("");
        }if (event.getPickResult().getIntersectedNode().getId().equalsIgnoreCase("Delet7") )
        {
            card=card7.getText();
            card7.setText("");
        }if (event.getPickResult().getIntersectedNode().getId().equalsIgnoreCase("Delet8") )
        {
            card=card8.getText();
            card8.setText("");
        }
        if (card .equalsIgnoreCase("giant")){ gaint=false;}
        if (card .equalsIgnoreCase("Valkyrie")){  val=false;}
        if (card .equalsIgnoreCase("babydragon")){ baby=false;}
        if (card.equalsIgnoreCase("pekka")){ pk=false;}
        if (card.equalsIgnoreCase("wizard")){  wiz=false;}
        if (card .equalsIgnoreCase("barbarians")){  baby=false;}
        if (card .equalsIgnoreCase("fireball")){  fire=false;}
        if (card .equalsIgnoreCase("arrows")){  arr=false;}
        if (card .equalsIgnoreCase("rage")){  rag=false;}
        if (card .equalsIgnoreCase("archer")){  archer=false;}
        if (card .equalsIgnoreCase("Cannon")){  canon=false;}
        if (card .equalsIgnoreCase("InfernoTower")){  inf=false;}
        Main.gameHandler.removeCard(card);
        Main.gameHandler.show();


     }


    @FXML
    void SelectCard(MouseEvent event) {
        boolean b=true;
        boolean enter=false;
        String cardname=event.getPickResult().getIntersectedNode().getId();
        if (cardname.equalsIgnoreCase("giant")){if (!gaint){enter=true;gaint=true;}}
        if (cardname.equalsIgnoreCase("Valkyrie")){if (!val){enter=true;val=true;}}
        if (cardname.equalsIgnoreCase("babydragon")){if (!baby){enter=true;baby=true;}}
        if (cardname.equalsIgnoreCase("pekka")){if (!pk){enter=true;pk=true;}}
        if (cardname.equalsIgnoreCase("wizard")){if (!wiz){enter=true;wiz=true;}}
        if (cardname.equalsIgnoreCase("barbarians")){if (!baby){enter=true;baby=true;}}
        if (cardname.equalsIgnoreCase("fireball")){if (!fire){enter=true;fire=true;}}
        if (cardname.equalsIgnoreCase("arrows")){if (!arr){enter=true;arr=true;}}
        if (cardname.equalsIgnoreCase("rage")){if (!rag){enter=true;rag=true;}}
        if (cardname.equalsIgnoreCase("archer")){if (!archer){enter=true;archer=true;}}
        if (cardname.equalsIgnoreCase("Cannon")){if (!canon){enter=true;canon=true;}}
        if (cardname.equalsIgnoreCase("InfernoTower")){if (!inf){enter=true;inf=true;}}
        while (enter)
        {
            if (card1.getText().equals(""))
            {
                card1.setText(cardname);
                Main.gameHandler.addCard(cardname);
                break;
            }
            else if (card2.getText().equals(""))
            {
                card2.setText(cardname);
                Main.gameHandler.addCard(cardname);
                break;
            }
            else if (card3.getText().equals(""))
            {
                card3.setText(cardname);
                Main.gameHandler.addCard(cardname);
                break;
            }
            else if (card4.getText().equals(""))
            {
                card4.setText(cardname);
                Main.gameHandler.addCard(cardname);
                break;
            }
            else if (card5.getText().equals(""))
            {
                card5.setText(cardname);
                Main.gameHandler.addCard(cardname);
                break;
            }
            else if (card6.getText().equals(""))
            {
                card6.setText(cardname);
                Main.gameHandler.addCard(cardname);
                break;
            }
            else if (card7.getText().equals(""))
            {
                card7.setText(cardname);
                Main.gameHandler.addCard(cardname);
                break;
            }
            else if (card8.getText().equals(""))
            {
                card8.setText(cardname);
                Main.gameHandler.addCard(cardname);
                break;
            }
            else {
                result.setText("you cannot");
                b=false;
                break;
            }

        }
if (b){result.setText("");}
enter=true;

    }

    @FXML
    void ShowCard(MouseEvent event) {

       ArrayList<Card> cards=  Main.gameHandler.player.existCard;
        //System.out.println(cards.get(0).getCardName());

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
    void question(MouseEvent event) {
       Main.set(1);
    }


}
