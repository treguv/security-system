package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.TestSensors;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/base.fxml")));
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("SimpliSafe Ultimate Security Pro Max Plus 9000 Edition v1");
        primaryStage.setScene(scene);
        primaryStage.show();
        TestSensors testSensors = new TestSensors();
        testSensors.simulateBreakin();
        testSensors.simulateDoorBellRing();
        testSensors.simulateContactEmergencyServices();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
