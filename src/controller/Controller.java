package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Controller {

    //Sample videos
    private final String[] myVideos = {"Motion_1", "Recording_1", "Live_Replay", "Recording_2", "Recording_3"};

    public BorderPane pane;


    @FXML
    private FlowPane myFlowPane;

    @FXML
    public void initialize() {
        String theSeed = getSeed();
        for(int i = 0; i < myVideos.length; i++) {
            int curIcon = (theSeed.charAt(i)-48) % 8;
            Thumbnail thumbnail = new Thumbnail(myVideos[i], this, curIcon);
            myFlowPane.getChildren().add(thumbnail);
        }

    }

    @FXML
    public void delete(final Thumbnail theThumbnail) {
        myFlowPane.getChildren().remove(theThumbnail);
    }

    private String getSeed(){
        String seed = "";
        try {
            File myObj = new File("seed.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //there should only ever be one line in the file
                seed = data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return seed;
    }

}
