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
        //temp vars to hold the amount of possible icons
        int min = 1;
        int max = 2;
        int range = max - min + 1;
        for(String video : myVideos) {
            int number = (int) (Math.random()  * range) + min;
            Thumbnail thumbnail = new Thumbnail(video, this, number);
            myFlowPane.getChildren().add(thumbnail);
        }

    }

    @FXML
    public void delete(final Thumbnail theThumbnail) {
        myFlowPane.getChildren().remove(theThumbnail);
    }

}
