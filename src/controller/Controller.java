package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import model.Thumbnail;

public class Controller{

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
            myFlowPane.getChildren().add(new Thumbnail(video));
        }
        System.out.println("works");

    }
}
