package model;

import controller.Controller;
import controller.MySidemenu;
import javafx.scene.control.Label;

public class TestButton extends Label {

    public TestButton(final String theName, final MySidemenu theSidemenu) {
        setText(theName);
        setMaxWidth(Integer.MAX_VALUE);
    }


}
