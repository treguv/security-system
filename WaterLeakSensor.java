package model.sensors;

/**
 * WaterLeakSensor
 */
public class WaterLeakSensor implements Sensor {
	private boolean waterLeakDectected;
	String deviceID;
	boolean deviceState;
	private boolean isTriggered = false;


	/**

	 * @author Kidus
	 *  
	 */
	public WaterLeakSensor(final String ID,final boolean state){
		this.deviceID = ID;
		this.deviceState =state;
		this.waterLeakDectected = false;

	}



	public void setDetectionStatus(final boolean state){

		this.waterLeakDectected = state;

	}


	public boolean getDectectionState(){

		return this.waterLeakDectected;


	}


	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

	public String getDeviceID() {
		return deviceID;
	}

	public boolean isDeviceState() {
		return this.deviceState;
	}

	public void setDeviceState(boolean state) {
		deviceState = state;
	}
	
    /**
     * returns the current status of the sensor
     * @return sensors isTriggered field
     */
	public boolean isTriggered() {

		return this.isTriggered;
	}
	
    /**
     * Updates the trigger status of the sensor
     * @param theStatus the updated status
     */
    public void setTriggered(boolean theStatus){
        isTriggered = theStatus;
    }
}


