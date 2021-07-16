package sample;

import Game.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    public static ArrayList<Player> players=new ArrayList<>();
    public static Player playercurent=new Player("yas");
    public static PlayerInformation playerInformation=new PlayerInformation();
   public static GameHandler gameHandler=new GameHandler();
    static AnchorPane root;
    static List<Pane>grid=new ArrayList<>();
    private static int idx_cur=0;
    public static String robat;
//   public ArrayList<Scene>scenes=new ArrayList<>();
//    public Stage windwo=new Stage();

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            root=(AnchorPane) FXMLLoader.load(getClass().getResource("1.fxml"));
            grid.add((Pane) FXMLLoader.load(getClass().getResource("sample.fxml")));
            grid.add((Pane) FXMLLoader.load(getClass().getResource("SignUp.fxml")));
            grid.add((Pane) FXMLLoader.load(getClass().getResource("mainPageClashRoyale.fxml")));
            grid.add((Pane) FXMLLoader.load(getClass().getResource("BattleDeck.fxml")));
            grid.add((Pane) FXMLLoader.load(getClass().getResource("TrainingCamp.fxml")));
            grid.add((Pane) FXMLLoader.load(getClass().getResource("Profile.fxml")));
            grid.add((Pane) FXMLLoader.load(getClass().getResource("OneVoneTwoVtwo.fxml")));
            grid.add((Pane) FXMLLoader.load(getClass().getResource("BattleHistory.fxml")));
            root.getChildren().add(grid.get(0));
            Scene scene=new Scene(root,500,800);
            primaryStage.setScene(scene);
            primaryStage.show();


        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

//        windwo=primaryStage;
//        Parent LogIn = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        Scene sceneLogIn=new Scene(LogIn,430,630);
//        scenes.add(sceneLogIn);
//        Parent SignUp = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
//        Scene sceneSignUp=new Scene(SignUp,430,630);
//        scenes.add(sceneSignUp);
//       windwo.setTitle("Clash Royale");
//        windwo.setScene(sceneLogIn);
//       windwo.show();
    }
    //public Scene GetScene(int index)
//  {
//    return scenes.get(index);
//  }
    public static void set(int idx)
    {
        root.getChildren().remove(grid.get(idx_cur));
        root.getChildren().add(grid.get(idx));
        idx_cur=idx;

    }
    public static void setPlayercurent(String user)
    {
        for (Player p:players) {
            if (user.equals(p.getUsername()))
            {
                 playercurent=p;
            }

        }
        addPlayer(user);
        gameHandler.setPlayer(new Player(user));
        gameHandler.showPlayer();
    }
    public static  void addPlayer(String user)
    {
        players.add(new Player(user));
    }

    public static void setRobat(String robat) {
        Main.robat = robat;
    }
    public static void ss()
    {
        playercurent.existCard.add(new Barbarians());
        playercurent.existCard.add(new Valkyrie());
        playercurent.existCard.add(new Archer());
        playercurent.existCard.add(new InfernoTower());
        playercurent.existCard.add(new Wizard());
        playercurent.existCard.add(new Giant());
        playercurent.existCard.add(new Cannon());
        playercurent.existCard.add(new PEKKA());
    }

    public static void main(String[] args) {
        launch(args);
    }

}

