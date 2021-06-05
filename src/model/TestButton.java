package model;

import controller.Controller;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class TestButton extends Label {

    private Controller myController;

    public TestButton(final String theName, final Controller theController) {
        myController = theController;
        setText(theName);
        setTextFill(Color.valueOf("616161"));
        setMaxWidth(Integer.MAX_VALUE);
        setOnMouseEntered(e -> myController.highlight(this));
        setOnMouseExited(e -> myController.unhighlight(this));
    }

}
