package sample;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ControllerMainPageClashRoyal {

    @FXML
    private ImageView battleDeck;

    @FXML
    private ImageView profile;

    @FXML
    private ImageView trainingCamp;

    @FXML
    private ImageView oneVoneTwoVtwo;

    @FXML
    private ImageView buttleHistory;


       /**
     * Method with the ability to enter the page layout of cards in each level of with
     * @param event 
     */
    @FXML
    void BattleDeck(MouseEvent event) {
         Main.set(3);
    }

       /**
     * Method with the ability to enter the history of win and lose history in the game
     * @param event 
     */
    @FXML
    void ButtleHistory(MouseEvent event) {
        Main.set(19);
    }


       /**
     * Method with the ability to enter the game page two or one n
     * @param event 
     */
    @FXML
    void OneVoneTwoVtwo(MouseEvent event) {
         Main.set(6);
    }

        /**
     * Method with the ability to enter the profile
     * @param event 
     */
    @FXML
    void Profile(MouseEvent event) {
        Main.set(5);
    }

       /**
     * Method with the ability to enter the game page with the robot
     * @param event 
     */
    @FXML
    void TrainingCamp(MouseEvent event) {
        Main.set(4);
    }
    @FXML
    void Exist(MouseEvent event) {
         Main.set(0);
    }

}
