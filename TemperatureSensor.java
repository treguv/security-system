package model.sensors;

import java.util.*;

/**
 *
 * @author 
 * 
 */

public class TemperatureSensor implements Sensor {
	private double Temperature;
	private String TemperatureLevel;
	public String deviceID;
	public boolean deviceState;
	private boolean isTriggered = false;
	

	public TemperatureSensor(String deviceID, boolean state, double Temperature) {
		this.deviceID = deviceID;
		this.Temperature = Temperature;
		this.deviceState = state;
	}

	public String getDeviceID() {
		return deviceID;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}


	public String getTemperatureLevel() {
		return TemperatureLevel;
	}

	public boolean getDeviceState() {
		return deviceState;
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

	public void turnOnOff() {
		deviceState = !deviceState;
	}

	public void setDeviceState(boolean state) {
		deviceState = state;
	}

	public void changeTempLevel(double Temperature) {
		if (Temperature < 41) {
			this.TemperatureLevel = " Low";
		} else if (Temperature > 300) {
			this.TemperatureLevel = "Dengerous";
		} else {
			this.TemperatureLevel = "normal";

		}
	}

	public boolean isDeviceState() {
		return this.deviceState;
	}

	public void changeTemp(double degree) {
		this.Temperature = Temperature;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String id;
		double Temperature;

		System.out.println("Enter device ID: ");
		id = sc.nextLine();
		System.out.println("Enter device Temperature: ");
		Temperature = sc.nextDouble();
		System.out.println("Enter device status (ON/OFF): ");
		String status = sc.nextLine();
		if (status.equals("")) {
			status = sc.nextLine();

		}
		boolean onOff;
		if (status.toLowerCase().equals("ON")) {
			onOff = true;
		} else {
			onOff = false;
		}

		TemperatureSensor d = new TemperatureSensor(id, onOff, Temperature);

		d.changeTempLevel(Temperature);

		System.out.println("Device Level: " + d.getTemperatureLevel());

	}
}
