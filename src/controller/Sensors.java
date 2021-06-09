package controller;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

import java.io.FileInputStream;

public class Sensors{

    @FXML
    GridPane grid;

    @FXML
    private void initialize(){
        int i = 0;
        for(String s: new String[]{"cctv", "doorbell", "doorsensor", "motion"}) {
            try {
                ImageView image = new ImageView();
                image.setImage(new Image(s + ".png"));
                image.setFitHeight(100);
                image.setFitWidth(100);
                grid.add(image, i%10, i/10,4,1);
                i+=4;
                grid.add(new Circle(4, Color.GREEN),i%10,i/10,1,1);
                i++;

            } catch (Exception e) {
                System.out.println("couldn't bruh");
            }
        }
    }
}
