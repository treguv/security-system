package controller;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * This class creates a thumbnail to display the video preview in the video view class
 * @author Andrei Larson
 */
public class Thumbnail extends AnchorPane {

    public static final Image DEFAULT_IMAGE = new Image("img_sample3.png");

    public static final Image TRASH_ICON = new Image("trash.png");

    private final String myTitle;

    private final Controller myController;

    private final String[] ICONS = {"img_live_1.png", "img_live_2.png", "img_live_3.png",
            "img_live_4.png", "img_live_5.png", "img_live_6.png", "img_live_7.png", "img_live_8.png"};

    /**
     * secondary constructor that allows you to change the icon on the image
     * @param theTitle Icon title
     * @param theController A controller object to bind functionality
     * @param theIcon A number representing the choice of icon filename from the ICONS array
     */
    public Thumbnail(final String theTitle, final Controller theController,int theIcon) {
        myTitle = theTitle;
        myController = theController;
        setPrefSize(120, 130);
        ImageView[] views = setupImages(theIcon);
        for (ImageView view : views) {

            getChildren().add(view);
        }
        getChildren().add(setupTitle());
    }

    /**
     * overloaded Image View method that allows for icon selection
     * @param theIcon Which file to be used form the ICONS array
     * @return
     */
    private ImageView[] setupImages(int theIcon) {
        Image theImage = DEFAULT_IMAGE;
        //if we have a valid url we can change the image otherwise it will be normal
        switch (theIcon){
            case 1:
                theImage = new Image(ICONS[0]);
                break;
            case 2:
                theImage = new Image(ICONS[1]);
                break;
            case 3:
                theImage = new Image(ICONS[2]);
                break;
            case 4:
                theImage = new Image(ICONS[3]);
                break;
            case 5:
                theImage = new Image(ICONS[4]);
                break;
            case 6:
                theImage = new Image(ICONS[5]);
                break;
            case 7:
                theImage = new Image(ICONS[6]);
                break;
            case 8:
                theImage = new Image(ICONS[7]);
                break;
        }
        ImageView defaultImage = new ImageView();
        defaultImage.setImage(theImage);
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
