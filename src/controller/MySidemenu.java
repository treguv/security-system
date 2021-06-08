package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import model.TestSensors;

public class MySidemenu {

    private final TestSensors myTests = new TestSensors();

    @FXML
    private VBox myVBox;

    @FXML
    public void initialize() {
        TestButton breakIn = new TestButton("Break-in");
        breakIn.setOnMouseClicked(e -> myTests.simulateBreakin());
        myVBox.getChildren().add(breakIn);
    }

}
