package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.FileWriter;
import java.util.Objects;
import java.util.Random;
import java.io.IOException;

public class Main extends Application {
    public static Sensors sensors;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/base.fxml")));
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("SimpliSafe Ultimate Security Pro Max Plus 9000 Edition v1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        generateSeed();
        launch(args);
    }

    /**
     * This class will generate a seed that will be used by all the pseudo random parts of the program
     * @return a seed of 10 digits
     */
    private static long generateSeed(){
        Random r = new Random();
        //generate the seed
        //This may cause issues! Sometimes gives negative numbers
        long seed = Math.abs(generateRandomNumber(1000000000,9999999999L, r));
        // write the seed to a text file that can be accessed from anywhere
        try {
            FileWriter myWriter = new FileWriter("seed.txt");
            myWriter.write("" +seed);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return seed;
    }

    private static long generateRandomNumber(int theStart, long theEnd, Random theRandom){
        if ( theStart > theEnd ) {
            throw new IllegalArgumentException("Start cannot exceed End.");
        }
        //get the range, casting to long to avoid overflow problems
        long range = (long)theEnd - (long)theStart + 1;
        // compute a fraction of the range, 0 <= frac < range
        long fraction = (long)(range * theRandom.nextDouble());
//        logger.info("fraction>>>>>>>>>>>>>>>>>>>>"+fraction);
        long randomNumber =  (int)(fraction + theStart);
//        logger.info("Generated : " + randomNumber);
        System.out.println(randomNumber);
        return randomNumber;
    }
}
