package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //loads storage.fxml scene
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/storage.fxml")));
        primaryStage.setTitle("SimpliSafe Ultimate Security Pro Max Plus 9000 Edition v1");
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
