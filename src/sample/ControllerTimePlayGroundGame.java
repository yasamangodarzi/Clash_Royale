package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import java.time.LocalTime;
import java.util.Date;

public class ControllerTimePlayGroundGame {
    @FXML
    private Label time;

    @FXML
    private Button button;

    @FXML
    void Button(MouseEvent event) {
        Date date = new Date();
        String strDate = date.toString();
        String[] strDateSplit = strDate.split(" ");
        String strTime = strDateSplit[3];
        String[] strDetails = strTime.split(":");
        int hour = Integer.parseInt(strDetails[0]);
        int minute = Integer.parseInt(strDetails[1]);
        int second = Integer.parseInt(strDetails[2]);
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            LocalTime currentTime = LocalTime.now();
            if (minute + 2 <= currentTime.getMinute() && second <= currentTime.getSecond() ||
                    minute + 3 == currentTime.getMinute() && second >= currentTime.getSecond()) {
                time.setTextFill(Color.RED);
                time.setText(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
            } else {
                time.setTextFill(Color.GREEN);
                time.setText(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
            }
        }),
                new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();

    }
}
