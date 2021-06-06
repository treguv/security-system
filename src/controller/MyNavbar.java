package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class MyNavbar {

    @FXML
    private Label myHome;

    @FXML
    private HBox myHBox;
    public void highlight() {
        //color for when mouse is hovering over a label
        myHome.setStyle("-fx-background-color: #383838; -fx-text-fill: #ffffff");
    }

    public void unhighlight() {
        //this should match the side menu and nav bar
        myHome.setStyle("-fx-background-color: #212121; -fx-text-fill: #ffffff");
    }

}
