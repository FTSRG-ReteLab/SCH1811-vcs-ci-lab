package hu.bme.mit.train.user;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;

public class TrainUserImpl implements TrainUser {

	private TrainController controller;
	private int joystickPosition;
	private boolean ligthSwitchPosition;
	private boolean doorSwitchPosition;

	public TrainUserImpl(TrainController controller) {
		this.controller = controller;
	}

	@Override
	public boolean getAlarmFlag() {
		return false;
	}

	@Override
	public int getJoystickPosition() {
		return joystickPosition;
	}

	@Override
	public void overrideJoystickPosition(int joystickPosition) {
		this.joystickPosition = joystickPosition;
		controller.setJoystickPosition(joystickPosition);
	}

	@Override
	public boolean getligthSwitchPosition() {
		return ligthSwitchPosition;
	}

	@Override
	public void overrideligthSwitchPosition(boolean ligthSwitchPosition) {
		this.ligthSwitchPosition = ligthSwitchPosition;
		controller.setligthSwitchPosition(ligthSwitchPosition);
	}

	@Override
	public boolean getdoorSwitchPosition() {
		return doorSwitchPosition;
	}

	@Override
	public void overridedoorSwitchPosition(boolean doorSwitchPosition) {
		this.doorSwitchPosition = doorSwitchPosition;
		controller.setdoorSwitchPosition(doorSwitchPosition);
	}

	

}
