package model.sensors;

/**
 * This is the class that will represent the keypad of the security system
 * the main function of the keypad is to arm and disarm the security system
 * @author vlad
 * @version 1
 */
public class Keypad {
    private String myPin;

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
     * ALlows the user to update the pin for the security system.
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
}
