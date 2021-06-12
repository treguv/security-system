package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.FlowPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller {

    //Sample videos
    private final String[] myVideos = {"Motion_1", "Recording_1", "Live_Replay", "Recording_2", "Recording_3"};

    @FXML
    private FlowPane myFlowPane;

    /**
     * Chooses random thumbnails to populate the video feed with
     */
    @FXML
    public void initialize() {
        String theSeed = getSeed();
        for(int i = 0; i < myVideos.length; i++) {
            int curIcon = (theSeed.charAt(i)-48) % 8;
            Thumbnail thumbnail = new Thumbnail(myVideos[i], this, curIcon);
            myFlowPane.getChildren().add(thumbnail);
        }
    }

    /**
     * Triggered by clicking a trash icon associated with a thumnail
     * @param theThumbnail
     */
    @FXML
    public void delete(final Thumbnail theThumbnail) {
        myFlowPane.getChildren().remove(theThumbnail);
    }

    /**
     * Generates random numbers from a seed stored in seed.txt
     * @return a String representing a pseudorandom value
     */
    private String getSeed(){
        String seed = "";
        try {
            File myObj = new File("seed.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                //there should only ever be one line in the file
                seed = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return seed;
    }
}
