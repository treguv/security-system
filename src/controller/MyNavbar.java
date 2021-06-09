package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Objects;

/**
 * This class allows for the attachment of listeners for the buttons in the navbar
 * It is sourced by the FXML file itself, so the only FXML that must be explicitly constructed is the base component
 */
public class MyNavbar {

    @FXML
    public ToggleButton sensors;
    @FXML
    public ToggleButton storage;
    @FXML
    public ToggleButton about;

    @FXML
    public void initialize() {
        myToggleGroup.getToggles().forEach(a-> {
            ToggleButton btn = (ToggleButton)a;
            String label = btn.getId();

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
