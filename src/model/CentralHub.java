package model;

/**
 * This class mimics the underlying central hub.
 * @version 1
 * @author Luke Sedillo, Samuel Hart
 */
public class CentralHub {
    /**
     * This is the systems armed status.
     */
    boolean myArmed = false;

    /**
     * This method arms the system.
     */
    public void armDisarm () {
        if (myArmed) {
            myArmed = false;
            System.out.println("Goliath offline");
        } else {
            myArmed = true;
            System.out.println("Goliath online");
        }
    }
}
