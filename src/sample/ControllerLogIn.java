/**
 * Sample Skeleton for 'sample.fxml' Controller Class
 */

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerLogIn {

    @FXML // fx:id="UserName"
    private TextField UserName; // Value injected by FXMLLoader

    @FXML // fx:id="Password"
    private TextField Password; // Value injected by FXMLLoader

    @FXML // fx:id="LogInButton"
    private Button LogInButton; // Value injected by FXMLLoader

    @FXML // fx:id="userWrong"
    private Label userWrong; // Value injected by FXMLLoader

    @FXML // fx:id="passwordWrong"
    private Label passwordWrong; // Value injected by FXMLLoader

    @FXML // fx:id="SignUp"
    private Button SignUp; // Value injected by FXMLLoader

    @FXML
    void LogIn(ActionEvent event) {
        String result=Main.playerInformation.check(UserName.getText(),Password.getText());
       if (result.equalsIgnoreCase("Wrong password")){passwordWrong.setText(result);}
       if (result.equalsIgnoreCase("Username is incorrect")){userWrong.setText(result);}


    }

    @FXML
    void SignUp(ActionEvent event) {
       Main.set(1);
    }

}

