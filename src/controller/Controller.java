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

    //Sample videos
    private final String[] myVideos = {"Motion_1", "Recording_1", "Live_Replay", "Recording_2", "Recording_3"};

    //Sample test buttons
    private final String[] myButtons = {"Test_1", "Test_2", "Test_3", "Test_4", "Test_5"};
    public BorderPane pane;


    @FXML
    private FlowPane myFlowPane;

    @FXML
    private VBox myVBox;

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

    }

    @FXML
    public void delete(final Thumbnail theThumbnail) {
        myFlowPane.getChildren().remove(theThumbnail);
    }

}
