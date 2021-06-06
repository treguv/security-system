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
    public static Color TEXT_COLOR = Color.valueOf("616161");

    //Sample videos
    private final String[] myVideos = {"Motion_1", "Recording_1", "Live_Replay", "Recording_2", "Recording_3"};

    //Sample test buttons
    private final String[] myButtons = {"Test_1", "Test_2", "Test_3", "Test_4", "Test_5"};

    @FXML
    private FlowPane myFlowPane;

    @FXML
    private Label myHome;

    @FXML
    private VBox myVBox;

    @FXML
    private HBox myHBox;

    @FXML
    private BorderPane myBorderPane;

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
        myHome.addEventHandler(MouseEvent.MOUSE_ENTERED, e -> highlight(myHome));
        myHome.addEventHandler(MouseEvent.MOUSE_EXITED, e -> unhighlight(myHome));
        myHome.setTextFill(Controller.TEXT_COLOR);
        //test button side menu color and nav bar color
        //these two should match
        myVBox.setStyle("-fx-background-color: #212122");
        myHBox.setStyle("-fx-background-color: #424242");
        //background color
        myBorderPane.setStyle("-fx-background-color: #212121");
    }

    @FXML
    public void delete(final Thumbnail theThumbnail) {
        myFlowPane.getChildren().remove(theThumbnail);
    }

    public void highlight(final Label theLabel) {
        //color for when mouse is hovering over a label
        theLabel.setStyle("-fx-background-color: #757575; -fx-text-fill: #ffffff");
    }

    public void unhighlight(final Label theLabel) {
        //this should match the side menu and nav bar
        theLabel.setStyle("-fx-background-color: #212121; -fx-text-fill: #616161");
    }

}
