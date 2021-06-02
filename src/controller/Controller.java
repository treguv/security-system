package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import model.Thumbnail;

import java.util.ArrayList;

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
        System.out.println("works");
    }

    @FXML
    public void delete(final Thumbnail theThumbnail) {
        myFlowPane.getChildren().remove(theThumbnail);
    }

}
