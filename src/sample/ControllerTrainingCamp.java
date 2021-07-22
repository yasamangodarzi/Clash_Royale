/**
 * Sample Skeleton for 'TrainingCamp.fxml' Controller Class
 */

package sample;

import Game.IntelligentRobot;
import Game.Player;
import Game.robot;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;

public class ControllerTrainingCamp {

    @FXML // fx:id="SimpleRobot"
    private Button SimpleRobot; // Value injected by FXMLLoader

    @FXML // fx:id="MediumRobot"
    private Button MediumRobot; // Value injected by FXMLLoader

    @FXML // fx:id="IntelligentRobot"
    private Button IntelligentRobot; // Value injected by FXMLLoader

    @FXML // fx:id="Backimage"
    private ImageView Backimage; // Value injected by FXMLLoader


    @FXML
    void choice(ActionEvent event) {
        if (event.equals(SimpleRobot))
        {

            Main.setRobat("SimpleRobot");
            Main.playerRobat=new robot(Main.robat,Main.playercurent.getXp());
            Main.set(20);

        }
        if (event.equals(MediumRobot))
        {
            Main.setRobat("MediumRobot");

        }
        if (event.equals(IntelligentRobot))
        {

            Main.setRobat("IntelligentRobot");
            Main.playerRobat=new IntelligentRobot(Main.robat,Main.playercurent.getXp());
            Main.set(20);

        }
        ///change page

    }

    @FXML
    void Back(MouseEvent event) {

          Main.set(2);
    }

}
