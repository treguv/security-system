package controller;

import controller.Controller;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * This class creates a thumbnail to
 */
public class Thumbnail extends AnchorPane {

    public static Image DEFAULT_IMAGE = new Image("img_sample3.png");

    public static Image TRASH_ICON = new Image("trash.png");

    private final String myTitle;

    private final Controller myController;

    public Thumbnail(final String theTitle, final Controller theController) {
        myTitle = theTitle;
        myController = theController;
        setPrefSize(120, 130);
        ImageView[] views = setupImages();
        for (ImageView view : views) {
            getChildren().add(view);
        }
        getChildren().add(setupTitle());
    }

    private ImageView[] setupImages() {
        ImageView defaultImage = new ImageView();
        defaultImage.setImage(DEFAULT_IMAGE);
        defaultImage.setFitHeight(120);
        defaultImage.setFitWidth(120);

        ImageView trashIcon = new ImageView();
        trashIcon.setImage(TRASH_ICON);
        trashIcon.setFitHeight(15);
        trashIcon.setFitWidth(15);
        trashIcon.setLayoutX(100);
        trashIcon.setLayoutY(109);
        trashIcon.setOnMouseClicked(e -> myController.delete(this));
        return new ImageView[] {defaultImage, trashIcon};
    }

    private Label setupTitle() {
        Label title = new Label();
        title.setText(myTitle);
        title.setLayoutX(15);
        title.setLayoutY(105);
        return title;
    }

}
