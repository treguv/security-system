package model;

import controller.Controller;
import javafx.scene.control.Label;

public class TestButton extends Label {

    public TestButton(final String theName, final Controller theController) {
        setText(theName);
        setMaxWidth(Integer.MAX_VALUE);
    }

}
