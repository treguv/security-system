package model.sensors;
/**
 * TODO remove this class before final submission
 * This class will be used to test the functionality of the sensors
 * It is to be removed when we submit the final version
 */
public class TestSensors {
    //build out a basic array of sensors that we will use for testing
    private Sensor frontCamera = new Camera("Front Door ");
    private Camera backyardCamera = new Camera("Back Door");
    private DoorbellCamera doorbellCamera = new DoorbellCamera("Doorbell Camera");

    /**
     * This method will simulate a robber breaking into the house to allow
     * for testing of the security system
     */
    public void simulateBreakin(){
        backyardCamera.trigger();
        frontCamera.trigger();
    }

    /**
     * TODO add what happens in a power outage
     */
    public void powerOutage(){

    }
}
