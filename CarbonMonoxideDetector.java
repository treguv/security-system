package model.sensors;




public class CarbonMonoxideDetector implements Sensor {

	private static final double LOWCOMIN = 0.5;
	private static final double LOWCOMAX = 5.0;
	private static final double NORCOMIN = 5.0;
	private static final double NORCOMAX= 30.0;
	private static final String DANGER= "Danger";
	private static final String NORMAL = "Normal";
	private static final String LOW = "Low";
	private String CMLevel;
	private double CMParticle;
	String deviceID;
	boolean deviceState;

	public CarbonMonoxideDetector(final String ID,final Boolean state,final String carbonLevel,final double carbonParticle){

		this.deviceID = ID;
		this.deviceState = state;
		this.CMLevel = carbonLevel;
		this.CMParticle = carbonParticle;

	}

	public String getCMLevel() {

		return this.CMLevel;

	}

	public double getCMParticle() {

		return this.CMParticle;
	}

	private void setCMLevel(final double particle){

		if(particle <= LOWCOMIN ||(particle>=LOWCOMIN && particle<LOWCOMAX)){
			this.CMLevel = LOW;

		} else if (particle >= NORCOMIN && particle<NORCOMAX){
			this.CMLevel = NORMAL;
		}

		else{
			this.CMLevel = DANGER;

		}

	}

	public void changeCMPartile(final double particle) {

		this.CMParticle = particle;
		setCMLevel(particle);
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
