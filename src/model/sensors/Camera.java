package model.sensors;

/**
 * This class will emulate the function of a camera
 * @author vlad
 * @version 1
 */
public class Camera extends Sensor implements IsTriggerable {
    private boolean isOnline;
    private boolean isDetectingMotion = false;
    private String myName;

    /**
     * default constructor sets camera online.
     */
    public Camera(String theName){
        super(theName);
        isOnline = true;
    }

    /**
     * This method is a place holder to implement whatever we need
     * we can have this return a jpg that is the "live feed"
     * TODO add functionality to this method
     */
    public void viewLiveFeed(){

    }
    /**
     * Toggle the online status of the camera
     * @param theOnline true if online, false if offline.
     */
    public void setOnline( boolean theOnline){
        isOnline = theOnline;
    }

    /**
     * get the online status of the camera
     * @return true if online, false if offline.
     */
    public boolean getOnline(){
        return isOnline;
    }

    /**
     * checks if the camera is detecting motion
     * @return true if detecting motion, false otherwise.
     */
    public boolean getMotionDetected(){
        return isDetectingMotion;
    }

    /**
     * updates the motion detection status of the camera.
     * @param theDetection the new motion detected status.
     */
    public void setDetectingMotion(boolean theDetection){
        isDetectingMotion = theDetection;
    }
    public boolean isTriggered(){
        return isDetectingMotion;
    }
//    @Override
//    public void trigger() {
//
//        System.out.println("Pleae");
//    }

}
