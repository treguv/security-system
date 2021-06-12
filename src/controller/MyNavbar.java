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
 * The listener replaces the root pane's center with the appropriate view depending on what button is clicked.
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
                    replace.setCenter(FXMLLoader.load(Objects.requireNonNull(getClass().getResource(
                            "/view/" + label + ".fxml"))));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }


            });
        });
    }

    @FXML
    public ToggleGroup myToggleGroup;

}
