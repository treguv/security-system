package controller;

import javafx.collections.ListChangeListener;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;

public class MyNavbar {

    public void initialize() {
        myToggleGroup.getToggles().forEach(a-> {
            ((ToggleButton)a).setOnMouseEntered((e) -> {
                ((Node)e.getSource()).setStyle("-fx-background-color: #383838; -fx-text-fill: #ffffff");
            });
            ((ToggleButton)a).setOnMouseExited((e) -> {
                ((Node)e.getSource()).setStyle("-fx-background-color: #212121; -fx-text-fill: #ffffff");
            });
        });
    }

    @FXML
    public ToggleGroup myToggleGroup;

}
