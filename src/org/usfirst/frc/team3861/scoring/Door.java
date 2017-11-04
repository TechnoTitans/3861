package org.usfirst.frc.team3861.scoring;

import org.usfirst.frc.team3861.motors.TalonSRX;


//this class will be used to open and close the door(s) that hold/push the ball
// ball
public class Door {
	
	
	@SuppressWarnings("unused")
	private Door() {}
	
	private static final double DOOR_MOTOR_SPEED = 0.3;
	
	private TalonSRX doorMotor;
	
	public Door(TalonSRX motor) {
		this.doorMotor = motor;	
	}

	// TODO Implement close and open methods
	// figure out timings of opening and closing the door
	// use small speed values
	
	
	public void close() {

	}
	
	public void open() {
		
	}
	
}
