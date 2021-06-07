package model.sensors;

public interface Sensor {
	
	String deviceID =null;
	boolean deviceState = false;
	
	
	public String getDeviceID();
    public boolean isDeviceState();
    public void setDeviceState(final boolean deviceState);
    public String toString();
    boolean isTriggered();

}
