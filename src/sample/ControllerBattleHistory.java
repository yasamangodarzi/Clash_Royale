package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

public class ControllerBattleHistory {

    String imageYesIcon = "C:\\Users\\Erfan\\IdeaProjects\\Clash_Royale\\src\\sample\\yesIcon.png";
    String imageNoIcon = "C:\\Users\\Erfan\\IdeaProjects\\Clash_Royale\\src\\sample\\Noicon.png";
    String imageInformationNo = "C:\\Users\\Erfan\\IdeaProjects\\Clash_Royale\\src\\sample\\informationNo.png";
    String imageInformationLoser = "C:\\Users\\Erfan\\IdeaProjects\\Clash_Royale\\src\\sample\\informationIcon-Loser.png";
    String imageInformationWinner = "C:\\Users\\Erfan\\IdeaProjects\\Clash_Royale\\src\\sample\\informationIcon-Winner.png";
    InputStream stream;

    @FXML
    private ImageView level1;

    @FXML
    private ImageView level2;

    @FXML
    private ImageView level3;

    @FXML
    private ImageView level4;

    @FXML
    private ImageView level5;

    @FXML
    private ImageView Backimage;

    @FXML
    private ImageView yesOrNo1;

    @FXML
    private ImageView yesOrNo2;

    @FXML
    private ImageView yesOrNo3;

    @FXML
    private ImageView yesOrNo4;

    @FXML
    private ImageView yesOrNo5;

    @FXML
    private ImageView Explanation1;

    @FXML
    private ImageView Explanation2;

    @FXML
    private ImageView Explanation3;

    @FXML
    private ImageView Explanation4;

    @FXML
    private ImageView Explanation5;



    @FXML
    void Back(MouseEvent event) {

    }

    public void commonMethodBattleHistory(int level, ImageView Explanation, ImageView yesOrNo){
        ArrayList<String> DirectoryList = Main.gameHandler.player.file.listDirectory("F:/ClashRoyal");
        if(DirectoryList.size() == level){
            try {
                stream = new FileInputStream(imageYesIcon);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Image imageYes = new Image(stream);
            yesOrNo.setImage(imageYes);
            if(Main.gameHandler.player.file.ResultGame){
                try {
                    stream = new FileInputStream(imageInformationWinner);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                Image imageWinner = new Image(stream);
                Explanation.setImage(imageWinner);
            }
            else{
                try {
                    stream = new FileInputStream(imageInformationLoser);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                Image imageLoser = new Image(stream);
                Explanation.setImage(imageLoser);
            }
        }
        else{
            try {
                stream = new FileInputStream(imageNoIcon);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Image imageNo = new Image(stream);
            Explanation.setImage(imageNo);
            try {
                stream = new FileInputStream(imageInformationNo);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Image imageInformationNot = new Image(imageInformationNo);
            Explanation.setImage(imageInformationNot);
        }
    }

    @FXML
    void Level1(MouseEvent event) {
        commonMethodBattleHistory(1, Explanation1, yesOrNo1);
    }

    @FXML
    void Level2(MouseEvent event) {
        commonMethodBattleHistory(2, Explanation2, yesOrNo2);
    }

    @FXML
    void Level3(MouseEvent event) {
        commonMethodBattleHistory(3, Explanation3, yesOrNo3);
    }

    @FXML
    void Level4(MouseEvent event) {
        commonMethodBattleHistory(4, Explanation4, yesOrNo4);
    }

    @FXML
    void Level5(MouseEvent event) {
        commonMethodBattleHistory(5, Explanation5, yesOrNo5);
    }

}
