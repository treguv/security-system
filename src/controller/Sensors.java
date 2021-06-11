package controller;

import javafx.fxml.FXML;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * This class constructs the
 */
public class Sensors{

    @FXML
    GridPane grid;

    @FXML
    private void initialize(){
        int i = 0;
        ColumnConstraints column0 = new ColumnConstraints();
        column0.setPercentWidth(40);
        column0.setHgrow();
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(5);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(40);
        ColumnConstraints column3 = new ColumnConstraints();
        column3.setPercentWidth(5);
        grid.setMinWidth(500);
        for(String s: new String[]{"cctv", "doorbell", "doorsensor", "motion"}) {
            try {
                ImageView image = new ImageView();
                image.setImage(new Image(s + ".png"));
                ColorAdjust whiteOut = new ColorAdjust();
                whiteOut.setBrightness(1.0);
                image.setEffect(whiteOut);
                image.setFitWidth(100);
                image.setFitHeight(100);

                grid.add(image, i%4, i/4,1,1);
                i++;
                grid.add(new Circle(4, Color.GREEN),i%4,i/4,1,1);
                i++;
            } catch (Exception e) {
                System.out.println("couldn't bruh");
            }
        }
    }
}
