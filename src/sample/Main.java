package sample;

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
    public static PlayerInformation playerInformation=new PlayerInformation();
    static AnchorPane root;
    static List<Pane>grid=new ArrayList<>();
    private static int idx_cur=0;
//   public ArrayList<Scene>scenes=new ArrayList<>();
//    public Stage windwo=new Stage();

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            root=(AnchorPane) FXMLLoader.load(getClass().getResource("1.fxml"));

            grid.add((Pane) FXMLLoader.load(getClass().getResource("sample.fxml")));
            grid.add((Pane) FXMLLoader.load(getClass().getResource("SignUp.fxml")));
            root.getChildren().add(grid.get(0));
            Scene scene=new Scene(root,430,630);
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

    public static void main(String[] args) {
        launch(args);
    }
}

