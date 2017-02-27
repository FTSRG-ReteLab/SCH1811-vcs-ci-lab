package hu.bme.mit.train.controller;

import java.util.ArrayList;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import hu.bme.mit.train.interfaces.TrainController;

public class TrainControllerImpl implements TrainController {

	private int step = 1;
	private boolean light_on = true;
	private boolean door_closed = true;
	private int referenceSpeed = 0;
	private int speedLimit = 0;

	private Table<Integer, String, String> records = HashBasedTable.create();  
	
	
	@Override
	public void addrecord() {
		
		records.put(1,"current_time","12:15");
		records.put(1,"joystick_position","5");
		records.put(1,"reference_speed","100");
		
	}
	
	@Override
	public boolean table_has_elements(){
		return records.isEmpty();
		
	}
	
	
	@Override
	public void followSpeed() {
		if (referenceSpeed < 0) {
			referenceSpeed = 0;
		} else {
			referenceSpeed += step;
		}

		enforceSpeedLimit();
	}
	@Override
	public int getReferenceSpeed() {
		return referenceSpeed;
	}

	@Override
	public void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
		enforceSpeedLimit();
		
	}

	private void enforceSpeedLimit() {
		if (referenceSpeed > speedLimit) {
			referenceSpeed = speedLimit;
		}
	}

	@Override
	public void setJoystickPosition(int joystickPosition) {
		this.step = joystickPosition;		
	}

	@Override
	public void setligthSwitchPosition(boolean ligthSwitchPosition){
		this.light_on = ligthSwitchPosition;		
	}

	@Override
	public void setdoorSwitchPosition(boolean doorSwitchPosition){
		this.door_closed = doorSwitchPosition;		
	}
	
	


}
