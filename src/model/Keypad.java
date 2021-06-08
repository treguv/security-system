package model;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

/**
 * This is the class that will represent the keypad of the security system
 * the main function of the keypad is to arm and disarm the security system
 * @author vlad
 * @version 1
 */
public class Keypad {
    private String myPin;
    private boolean isArmed = false;

    /**
     * single parameter constructor expecting a starting pin for the keypad
     * @param thePin the pincode for the app
     */
    public Keypad(String thePin){
        this.myPin = thePin;
    }

    /**
     * No parameter constructor sets default pin to 1234
     */
    public Keypad () {
        this.myPin = "1234";
    }

    /**
     * Update the pin code that the keypad expects
     * @param thePin the new pin code
     */
    private void setPin(String thePin){
        this.myPin = thePin;
    }

    /**
     * Allows the user to update the pin for the security system.
     * requires current pin to update the pin
     * @param theOldPin the current pin for the system
     * @param theNewPin the new pin to set
     * @return true if update successful, otherwise false;
     */
    public boolean updatePin(String theOldPin, String theNewPin){
        if(theOldPin.equals(myPin)){
            setPin(theNewPin);
            return true;
        } else {
            System.out.println("Current pin did not match... Pin not updated...");
            return false;
        }
    }

    /**
     * Checks to see if the given pin matches with the one in the keypad
     * @param thePin the pin to check
     * @return true if pin matches, otherwise false.
     */
    public boolean validatePin(String thePin){
        return (thePin.equals(myPin));
    }

    /**
     * Arms the system if the given pin code is correct.
     * @param thePin the current pin code
     * @return true if the system was armed, false if previously armed or was wrong pin
     */
    public boolean armSystem(String thePin){
        if(validatePin(thePin) && !isArmed){
            isArmed = true;
            return true;
        } else if(isArmed){
            System.out.println("System is already armed...");
        } else{
            //the only other reason to not be set is if the pin is invalid
            System.out.println("Invalid pin....");
        }
        return false;
    }

    /**
     * Disarms the system if it is armed
     * @param thePin the current pin
     * @return true if the system was disarmed, false if previously disarmed or the pin was wrong
     */
    public boolean disarmSystem(String thePin){
        if(validatePin(thePin) && isArmed){
            isArmed = false;
            return true;
        } else if(!isArmed){
            System.out.println("System is already disarmed...");
        } else{
            //the only other reason to not be set is if the pin is invalid
            System.out.println("Invalid pin....");
        }
        return false;
    }
    /**
     * This class will return the pin for TESTING ONLY
     * TODO remove this method before final submission
     * @return the current pin for the keypad
     */
    public String getMyPin(){
        return myPin;
    }
}
