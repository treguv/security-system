package model;

/**
 * This is the class that mimics the door sensor
 * @author vlad
 * @version 1
 */
public class DoorSensor extends Sensor implements IsTriggerable {
    private String myName;
    private boolean doorOpen = false;
    public DoorSensor(String theName){
        super(theName);
    }
    public void setDoorStatus(boolean theDoorStatus){
        doorOpen = theDoorStatus;
    }

    /**
     * if the sensor is triggered returns true
     * @return true if sensor is triggered
     */
    @Override
    public boolean isTriggered() {
        return doorOpen;
    }
}
