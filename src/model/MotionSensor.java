package model;

/**
 * This class will imitate the functionality of the motion sensor
 * @author Vlad
 * @version 1
 */
public class MotionSensor extends Sensor implements IsTriggerable {
    private boolean isTriggered = false;
    private boolean isConnected = true;
    private String myName;
    /**
     * Just kinda because i can
     */
    private boolean isBroken = false;
    public MotionSensor(String theName){
        super(theName);
    }

    /**
     * Updates the trigger status of the sensor
     * @param theStatus the updated status
     */
    public void setTriggered(boolean theStatus){
        isTriggered = theStatus;
    }

    /**
     * returns the current status of the sensor
     * @return sensors isTriggered field
     */
    public boolean getTriggered(){
        return isTriggered;
    }
    /**
     * This method will simulate a sensor trigger. It is to be called from elsewhere
     */
    public void testTriggerSensor(){
        isTriggered = true;
    }

    /**
     * Checks if the given sensor has been triggered.
     * @return true if has been triggered
     */
    public boolean isTriggered(){
        return isTriggered;
    }
}
