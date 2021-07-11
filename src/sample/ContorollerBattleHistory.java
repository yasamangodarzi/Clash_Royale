/**
 * Sample Skeleton for 'BattleHistory.fxml' Controller Class
 */

package sample;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ContorollerBattleHistory {

    @FXML // fx:id="Backimage"
    private ImageView Backimage; // Value injected by FXMLLoader

    @FXML
    void Back(MouseEvent event) {
           Main.set(2);
    }

}
