package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;


public class Controller {

    //Sample videos
    private final String[] myVideos = {"Motion_1", "Recording_1", "Live_Replay", "Recording_2", "Recording_3"};

    public BorderPane pane;


    @FXML
    private FlowPane myFlowPane;

    @FXML
    public void initialize() {
        //Adds sample videos to flow pane
        for(String video : myVideos) {
            Thumbnail thumbnail = new Thumbnail(video, this);
            myFlowPane.getChildren().add(thumbnail);
        }

    }

    @FXML
    public void delete(final Thumbnail theThumbnail) {
        myFlowPane.getChildren().remove(theThumbnail);
    }

}
