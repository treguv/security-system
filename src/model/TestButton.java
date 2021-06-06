package model;

import controller.Controller;
import javafx.scene.control.Label;

public class TestButton extends Label {

    private final Controller myController;

    public TestButton(final String theName, final Controller theController) {
        myController = theController;
        setText(theName);
        setTextFill(Controller.TEXT_COLOR);
        setMaxWidth(Integer.MAX_VALUE);
        setOnMouseEntered(e -> myController.highlight(this));
        setOnMouseExited(e -> myController.unhighlight(this));
    }

}
