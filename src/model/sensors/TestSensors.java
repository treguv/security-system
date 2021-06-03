package model.sensors;
/**
 * TODO remove this class before final submission
 * This class will be used to test the functionality of the sensors
 * It is to be removed when we submit the final version
 */
public class TestSensors {
    public static void main(String[] args) {
        // make a new keypad
        Keypad keypad = new Keypad();
        System.out.println(keypad.getMyPin());
        //update the pin
        keypad.updatePin("1234", "4321");
        System.out.println(keypad.getMyPin());
        keypad.updatePin("123sdf4", "4321");

    }
}
