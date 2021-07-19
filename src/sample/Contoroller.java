package sample;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class  Contoroller {

    @FXML
    private ImageView exit;

    @FXML
    private ImageView rearIcon;

    @FXML
    private ImageView frontIcon;

    @FXML
    void Exit(MouseEvent event) {
          Main.set(3);
    }

    @FXML
    void FrontIconGaint(MouseEvent event) {
       Main.set(10);
    }

    @FXML
    void RearIconGaint(MouseEvent event) {
       Main.set(8);
    }

    @FXML
    void FrontIconFire(MouseEvent event) {
       Main.set(11);
    }

    @FXML
    void RearIconFire(MouseEvent event) {
          Main.set(9);
    }
    @FXML
    void FrontIconArcher(MouseEvent event) {
         Main.set(13);
    }

    @FXML
    void RearIconArcher(MouseEvent event) {
        Main.set(11);
    }
    @FXML
    void FrontIconArrow(MouseEvent event) {
        Main.set(14);
    }

    @FXML
    void RearIconArrow(MouseEvent event) {
        Main.set(12);
    }
    @FXML
    void FrontIconBaby(MouseEvent event) {
         Main.set(15);
    }

    @FXML
    void RearIconBaby(MouseEvent event) {
      Main.set(13);
    }
    @FXML
    void FrontIconBar(MouseEvent event) {
         Main.set(16);
    }

    @FXML
    void RearIconBar(MouseEvent event) {
          Main.set(14);
    }
    @FXML
    void RearIconCanon(MouseEvent event) {
        Main.set(17);
    }

    @FXML
    void FrontIconWizard(MouseEvent event) {
          Main.set(17);
    }

    @FXML
    void RearIconWizard(MouseEvent event) {
       Main.set(15);
    }
    @FXML
    void FrontIconValk(MouseEvent event) {
          Main.set(8);
    }
    @FXML
    void FrontIconP(MouseEvent event) {
        Main.set(12);
    }

    @FXML
    void RearIconP(MouseEvent event) {
         Main.set(10);
    }
    @FXML
    void FrontIconInf(MouseEvent event) {
            Main.set(18);
    }

    @FXML
    void RearIconInf(MouseEvent event) {
          Main.set(16);
    }

    @FXML
    void FrontIconRage(MouseEvent event) {
       Main.set(9);
    }

    @FXML
    void RearIconRage(MouseEvent event) {
        Main.set(7);
    }

}
