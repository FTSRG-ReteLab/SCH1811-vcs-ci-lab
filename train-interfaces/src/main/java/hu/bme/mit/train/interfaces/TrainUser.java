package hu.bme.mit.train.interfaces;

public interface TrainUser {

	int getJoystickPosition();

	boolean getAlarmFlag();

	void overrideJoystickPosition(int joystickPosition);

	public boolean getligthSwitchPosition();
		
		
	public void overrideligthSwitchPosition(boolean ligthSwitchPosition);
		

	
	public boolean getdoorSwitchPosition();
		
	
	
	public void overridedoorSwitchPosition(boolean doorSwitchPosition);
		

	
}
