package model.sensors;

/**
 * This is the interface parent class that will allow us to store all the sensors in a single DS
 * All children must have a "is triggered" sensor
 * This will allow us to iterate and check if any sensor is triggered
 */
public interface Sensor {
     boolean isTriggered();
}
