package model.sensors;

/**
 * WaterLeakSensor
 */
public class WaterLeakSensor implements Sensor {
	private boolean waterLeakDectected;
	String deviceID;
	boolean deviceState;


	/**

	 * @param Kidus
	 * @param 
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

	public boolean isTriggered() {

		return false;
	}

}


