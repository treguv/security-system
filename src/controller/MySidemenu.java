package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import model.TestSensors;

/**
 * This class is the controller for the Sidemenu view which adds all buttons and listeners to it
 * It is responsible for calling our test scenarios defined in {@link TestSensors}
 */
public class MySidemenu {

    private final TestSensors myTests = new TestSensors();

    @FXML
    private VBox myVBox;

    @FXML
    public void initialize() {
        TestButton breakIn = new TestButton("Sim Break-in");
        breakIn.setOnMouseClicked(e -> myTests.simulateBreakin());
        myVBox.getChildren().add(breakIn);
        TestButton dbring = new TestButton("Sim Doorbell");
        dbring.setOnMouseClicked(e -> myTests.simulateDoorBellRing());
        myVBox.getChildren().add(dbring);
        TestButton camMotion = new TestButton("Sim CamMotion");
        camMotion.setOnMouseClicked(e -> myTests.simulateCameraDetectingMotion());
        myVBox.getChildren().add(camMotion);
        TestButton ems = new TestButton("Sim EMS");
        ems.setOnMouseClicked(e -> myTests.simulateContactEmergencyServices());
        myVBox.getChildren().add(ems);
        TestButton doorSensor = new TestButton("Sim Door Open");
        doorSensor.setOnMouseClicked(e -> myTests.simulateDoorOpen());
        myVBox.getChildren().add(doorSensor);
        TestButton motionSensor = new TestButton("Sim Motion");
        motionSensor.setOnMouseClicked(e -> myTests.simulateMotion());
        myVBox.getChildren().add(motionSensor);
        TestButton cmd = new TestButton("Sim Carbon");
        cmd.setOnMouseClicked(e -> myTests.simulateCarbonMonoxideDetectorDetectionCarbonMonoxide());
        myVBox.getChildren().add(cmd);
    }
}
