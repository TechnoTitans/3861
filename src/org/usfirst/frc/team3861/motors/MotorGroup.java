package org.usfirst.frc.team3861.motors;

import java.util.ArrayList;

import org.usfirst.frc.team3861.motors.TalonSRX;

import org.usfirst.frc.team3861.motors.Motor;

import org.usfirst.frc.team3861.sensors.Encoder; 

public class MotorGroup extends ArrayList<Motor>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 357956843563840559L;
	private Encoder encoder;
	
	//private AntiDrift antiDrift;
	
	public MotorGroup(Encoder encoder, Motor... motors) {
		this.encoder = encoder;
		for (Motor motor : motors) {
			if (motor instanceof TalonSRX) {
				((TalonSRX)motor).setEncoder(encoder);
			}
			super.add(motor);
		}
	}
	
	public MotorGroup(Motor... motors) {
		for (Motor motor : motors) {
			super.add(motor);
		}
	}
	
	/**
	 * @return all the motors in the group
	 */
	public ArrayList<Motor> getMotors() {
		ArrayList<Motor> motors = new ArrayList<Motor>();
		for (Motor motor : this) {
			motors.add(motor);
		}
		return motors;
	}
	
	/**
	 * Set collective speed of motors.
	 *
	 * @param speed
	 *            Speed from 0 to 1.
	 */
	public void set(double speed) {
		for (Motor motor : this) {
			((TalonSRX) motor).set(speed);
		}
	}
	
	/**
	 * @return average speed of motors
	 */
	public double getSpeed() {
		double speed = 0;
		for (Motor motor : this) {
			speed += motor.get();
		}
		return speed / this.size();
	}
	
	/**
	 * Stops group.
	 */
	public void stop() {
		for (Motor motor : this) {
			motor.stop();
		}
	}
	
	/**
	 * @return The encoder associated with the group.
	 */
	public Encoder getEncoder() {
		return encoder;
	}

	public void enableBrakeMode(boolean enabled) {
		for (Motor motor : this) {
			if (motor instanceof TalonSRX) {
				((TalonSRX) motor).enableBrakeMode(enabled);
			}
		}
	}
}
