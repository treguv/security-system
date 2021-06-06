package controller;

import javafx.beans.NamedArg;
import javafx.collections.ListChangeListener;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.util.Objects;

public class MyNavbar {

    @FXML
    public ToggleButton sensors;
    @FXML
    public ToggleButton storage;
    @FXML
    public ToggleButton about;

    public void initialize() {
        myToggleGroup.getToggles().forEach(a-> {
            ToggleButton btn = (ToggleButton)a;
            String label = btn.getId();
            btn.setOnMouseEntered((e) -> {
                ((Node)e.getSource()).setStyle("-fx-background-color: #383838; -fx-text-fill: #ffffff");
            });
            btn.setOnMouseExited((e) -> {
                ((Node)e.getSource()).setStyle("-fx-background-color: #212121; -fx-text-fill: #ffffff");
            });
            btn.setOnMouseClicked((e) -> {
                BorderPane replace = (BorderPane)btn.getParent().getParent();
                try {
                    replace.setCenter(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/" + label + ".fxml"))));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }


            });
        });
    }

    @FXML
    public ToggleGroup myToggleGroup;

}
