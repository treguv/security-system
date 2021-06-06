package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import model.TestButton;
import model.Thumbnail;


public class Controller {

    //text color
    public static Color TEXT_COLOR = Color.valueOf("ffffff");

    //Sample videos
    private final String[] myVideos = {"Motion_1", "Recording_1", "Live_Replay", "Recording_2", "Recording_3"};

    //Sample test buttons
    private final String[] myButtons = {"Test_1", "Test_2", "Test_3", "Test_4", "Test_5"};

    @FXML
    private FlowPane myFlowPane;


    @FXML
    private VBox myVBox;


    @FXML
    private BorderPane myBorderPane;

    @FXML
    public void highlight(Label label) {
        //color for when mouse is hovering over a label
        label.setStyle("-fx-background-color: #383838; -fx-text-fill: #ffffff");
    }

    @FXML
    public void unhighlight(Label label) {
        //this should match the side menu and nav bar
        label.setStyle("-fx-background-color: #212121; -fx-text-fill: #ffffff");
    }

    @FXML
    public void initialize() {
        //Adds sample videos to flow pane
        for(String video : myVideos) {
            Thumbnail thumbnail = new Thumbnail(video, this);
            myFlowPane.getChildren().add(thumbnail);
        }
        //Adds sample test buttons to vbox
        for(String button : myButtons) {
            TestButton testButton = new TestButton(button, this);
            myVBox.getChildren().add(testButton);
        }
        //test button side menu color and nav bar color
        //these two should match
        myVBox.setStyle("-fx-background-color: #212121");
        //background color
        myBorderPane.setStyle("-fx-background-color: #181818");
    }

    @FXML
    public void delete(final Thumbnail theThumbnail) {
        myFlowPane.getChildren().remove(theThumbnail);
    }


}
