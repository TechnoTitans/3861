package org.usfirst.frc.team3861.scoring;

import org.usfirst.frc.team3861.motors.TalonSRX;


@Deprecated
public class Flywheel implements ScoringMotor{
	
	TalonSRX flywheelMotor;

	private double liftSpeed = 1.0;// TODO find how fast it should turn

	public Flywheel(int channel) {
		this.flywheelMotor = new TalonSRX(channel, true);
	}

	// Takes positive double
	public void setSpeed(double speed) {
		if (speed > .9)
			speed = .9;
		if (speed < 0)
			speed = 0;
		liftSpeed = speed;
	}

	// turn the flywheel
	public void turnOn() {
		flywheelMotor.set(liftSpeed);
	}

	public void turnOtherWay() {
		flywheelMotor.set(-liftSpeed);
	}

	public void stop() {
		flywheelMotor.coast();
	}

	public TalonSRX getMotor() {
		return flywheelMotor;
	}
}
