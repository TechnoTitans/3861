package org.usfirst.frc.team3861.scoring;

import org.usfirst.frc.team3861.motors.TalonSRX;


//this class will be used to open and close the door(s) that hold/push the ball
// ball
public class Door {
	
	@SuppressWarnings("unused")
	private Door() {}
	
	private double speed = 0.2; //TODO find value
	
	private TalonSRX doorMotor;
	
	public Door(int channel) {
		this.doorMotor = new TalonSRX(channel, true);	//TODO channel inverted
	}

	// TODO Implement close and open methods
	// figure out timings of opening and closing the door
	// use small speed values
	
	
	public void setSpeed(double speed) {
		speed = speed/3;
		if (speed > .3)
			speed = .3;
		if (speed < -.3)
			speed = -.3;
		this.speed = speed;
	}
	
	public void change() {
		doorMotor.set(speed); //might need to set to negative speed
	}

	
}
