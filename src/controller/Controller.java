package controller;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import model.TestButton;
import model.Thumbnail;


public class Controller {

    //test 'videos'
    private String[] myVideos = {"Motion_1", "Recording_1", "Live_Replay", "Recording_2", "Recording_3"};

    private String[] myButtons = {"Break In", "Power Outage ", "Ring Doorbell", "Detect Motion", "Emergency Services"};

    //flow pane that contains the video thumbnails
    @FXML
    private FlowPane myFlowPane;

    //home button should link to the home fxml scene
    @FXML
    private Label myHome;

    @FXML
    private VBox myVBox;

    @FXML
    public void initialize() {
        //Adds videos to flow pane
        for(String video : myVideos) {
            Thumbnail thumbnail = new Thumbnail(video, this);
            myFlowPane.getChildren().add(thumbnail);
        }
        //for now gonna make buttons manually so i can assign the correct events to it
        //TODO this might be where we need to declare sensors
        //This for loop probably needs to be replaced with individual declarations
        //All code for event sim is in testsensors
        for(String button : myButtons) {
            TestButton testButton = new TestButton(button, this);
//            testButton.setOnMouseClicked();
            myVBox.getChildren().add(testButton);
        }
    }

    @FXML
    public void delete(final Thumbnail theThumbnail) {
        myFlowPane.getChildren().remove(theThumbnail);
    }

    @FXML
    public void highlight() {
        myHome.setStyle("-fx-background-color: #757575; -fx-text-fill: #ffffff");
    }

    public void highlight(final Label theLabel) {
        theLabel.setStyle("-fx-background-color: #757575; -fx-text-fill: #ffffff");
    }

    @FXML
    public void unhighlight() {
        myHome.setStyle("-fx-background-color: #1f1b24; -fx-text-fill: #616161");
    }

    public void unhighlight(final Label theLabel) {
        theLabel.setStyle("-fx-background-color: #1f1b24; -fx-text-fill: #616161");
    }

}
