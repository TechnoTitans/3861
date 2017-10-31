package org.usfirst.frc.team3861.scoring;

import org.usfirst.frc.team3861.motors.TalonSRX;

public class Belt implements ScoringMotor{
	
	TalonSRX beltMotor;

	private double liftSpeed = 1.0;// TODO find how fast it should turn

	public Belt(int channel) {
		this.beltMotor = new TalonSRX(channel, true);
	}

	// Takes positive double
	public void setSpeed(double speed) {
		if (speed > .9)
			speed = .9;
		if (speed < 0)
			speed = 0;
		liftSpeed = speed;
	}

	// turn on the belt
	public void turnOn() {
		beltMotor.set(liftSpeed);
	}

	public void turnOtherWay() {
		beltMotor.set(-liftSpeed);
	}

	public void stop() {
		beltMotor.coast();
	}

	public TalonSRX getMotor() {
		return beltMotor;
	}


}
