package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import model.TestButton;

public class MySidemenu {

    //Sample test buttons
    private final String[] myButtons = {"Test_1", "Test_2", "Test_3", "Test_4", "Test_5"};

    @FXML
    private VBox myVBox;

    @FXML
    public void initialize() {
        //Adds sample test buttons to vbox
        for (String button : myButtons) {
            TestButton testButton = new TestButton(button, this);
            myVBox.getChildren().add(testButton);
        }
    }
}
