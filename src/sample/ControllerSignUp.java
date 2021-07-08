/**
 * Sample Skeleton for 'SignUp.fxml' Controller Class
 */

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerSignUp {

    @FXML // fx:id="UserName"
    private TextField UserName; // Value injected by FXMLLoader

    @FXML // fx:id="Password"
    private TextField Password; // Value injected by FXMLLoader

    @FXML // fx:id="IgnUPButton"
    private Button IgnUPButton; // Value injected by FXMLLoader

    @FXML // fx:id="RepeatPassword"
    private TextField RepeatPassword; // Value injected by FXMLLoader

    @FXML // fx:id="Name"
    private TextField Name; // Value injected by FXMLLoader

    @FXML // fx:id="Result"
    private Label Result; // Value injected by FXMLLoader

    @FXML
    void SignUp(ActionEvent event) {
        String repeatPassword=RepeatPassword.getText();
        String  password=Password.getText();
        if (repeatPassword.equals(password))
        {
            Main.playerInformation.addPlayer(Name.getText(),UserName.getText(),Password.getText());
            Result.setText("connected");


        }
        else {
            Result.setText(" Wrong password");

        }
    }

}
