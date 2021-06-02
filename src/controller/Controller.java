package controller;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import model.Thumbnail;


public class Controller {

    //test 'videos'
    private String[] myVideos = {"Motion_detected", "Recording_1", "Live_Replay", "Recording_2", "Recording_3"};

    //flow pane that contains the video thumbnails
    @FXML
    private FlowPane myFlowPane;

    //home button should link to the home fxml scene
    @FXML
    private Label myHome;

    @FXML
    public void initialize() {
        //Adds videos to flow pane
        for(String video : myVideos) {
            Thumbnail thumbnail = new Thumbnail(video, this);
            myFlowPane.getChildren().add(thumbnail);
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

    @FXML
    public void unhighlight() {
        myHome.setStyle("-fx-background-color: #1f1b24; -fx-text-fill: #616161");
    }

}
