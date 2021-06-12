package controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

/**
 * This class constructs the
 */
public class Sensors{

    @FXML
    GridPane grid;
    @FXML
    Button dismiss;

    Node[] indicators = new Node[4];
    Node[] warnings = new Node[]{new Text("!"), new Text("!"), new Text("!"), new Text("!")};

    @FXML
    private void initialize(){
        Main.sensors = this;
        int i = 0;
        ColumnConstraints column0 = new ColumnConstraints();
        column0.setMinWidth(100);
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setMinWidth(100);
        column1.setMaxWidth(200);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setMinWidth(100);
        ColumnConstraints column3 = new ColumnConstraints();
        column3.setMinWidth(100);
        column3.setMaxWidth(200);
        grid.getColumnConstraints().addAll(column0, column1, column2, column3);
        int j = 0;
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
                Circle circle = new Circle(4, Color.GREEN);
                circle.setId("" + j);
                indicators[j++] = circle;
                    grid.add(circle, i % 4, i / 4, 1, 1);

                i++;
            } catch (Exception e) {
                System.out.println("couldn't bruh");
            }
        }
    }

    public void trigger(String sensor) {
        System.out.println("this worked");
        try {
            switch(sensor) {
                case "Back Door":
                case "Front Door ": {
                    grid.getChildren().remove(indicators[0]);
                    grid.add(warnings[0], 1, 0);
                    break;
                }
                case "Doorbell Camera": {
                    grid.getChildren().remove(indicators[1]);
                    grid.add(warnings[1], 3, 0);
                    break;
                }
                case "Garage": {
                    grid.getChildren().remove(indicators[2]);
                    grid.add(warnings[2], 1, 1);
                    break;
                }
                case "Living room": {
                    grid.getChildren().remove(indicators[3]);
                    grid.add(warnings[3], 3, 1);
                    break;
                }

            }
        } catch(IllegalArgumentException e) {/*this occurs when it has already been triggered*/}
    }

    @FXML
    private void dismiss() {
        grid.getChildren().removeAll(warnings);
        for(int i = 0; i < 4; i++ ) {
            try {
                grid.add(indicators[i], (i%2)*2+1, i/2);
            } catch(Exception e) {/*This occurs when the indicator is not present*/}
        }
    }
}
