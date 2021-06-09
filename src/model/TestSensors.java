package model;
/**
 * TODO remove this class before final submission
 * This class will be used to test the functionality of the sensors
 * It is to be removed when we submit the final version
 */
public class TestSensors {
    //build out a basic array of sensors that we will use for testing
    private Camera frontCamera = new Camera("Front Door ");
    private Camera backyardCamera = new Camera("Back Door");
    private DoorbellCamera doorbellCamera = new DoorbellCamera("Doorbell Camera");
    private EmergencyServices weewoo = new EmergencyServices();
    private DoorSensor garageDoor = new DoorSensor("Garage");
    private MotionSensor living_room = new MotionSensor("Living room");
    private CarbonMonoxideDetector cmd = new CarbonMonoxideDetector("Carbon monoxide detector");

    /**
     * This method will simulate a robber breaking into the house to allow
     * for testing of the security system
     */
    public void simulateBreakin(){
        backyardCamera.trigger();
        frontCamera.trigger();
    }

    /**
     * This class will simulate a doorbell ringing
     */
    public void simulateDoorBellRing(){
        doorbellCamera.trigger();
        doorbellCamera.dingDong();
        //set motion detection to true
        doorbellCamera.setDetectingMotion(true);
        System.out.println("Some dude is at your door!");
    }

    /**
     * This class will simuulate the camera detecting motion
     */
    public void simulateCameraDetectingMotion(){
        //call camera is triggered and set its detect motion to true
        frontCamera.isTriggered();
        frontCamera.trigger();
    }
    public void simulateContactEmergencyServices(){
        weewoo.contactFireDepartment();
        weewoo.contactPolice();
    }

    public void simulateDoorOpen() {
        garageDoor.trigger();
    }

    public void simulateMotion() {
        living_room.trigger();
    }

    public void simulateCarbonMonoxideDetectorDetectionCarbonMonoxide() {
        cmd.trigger();
        System.out.println("THIS IS NOT A DRILL");
        System.out.println("I REPEAT");
        System.out.println("THIS IS NOT A DRILL");
        System.out.println("EVACUATE THE PREMISES IMMEDIATELY");
        System.out.println("WEE");
        System.out.println("WOO");
    }

}
