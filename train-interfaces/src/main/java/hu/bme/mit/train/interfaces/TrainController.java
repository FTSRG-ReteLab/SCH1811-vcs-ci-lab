package hu.bme.mit.train.interfaces;

public interface TrainController {

	void followSpeed();

	int getReferenceSpeed();

	void setSpeedLimit(int speedLimit);

	void setJoystickPosition(int joystickPosition);

	void setligthSwitchPosition(boolean ligthSwitchPosition);

	void setdoorSwitchPosition(boolean doorSwitchPosition);
	
	void addrecord();
		
	public boolean table_has_elements();


}
