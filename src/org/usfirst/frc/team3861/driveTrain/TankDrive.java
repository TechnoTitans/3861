package org.usfirst.frc.team3861.driveTrain;

import org.usfirst.frc.team3861.sensors.Encoder;

import org.usfirst.frc.team3861.motors.MotorGroup;
import org.usfirst.frc.team3861.sensors.Gyro;

public class TankDrive implements DriveTrain{
	private MotorGroup left;
	private MotorGroup right;
	private Gyro gyro;

	public TankDrive(MotorGroup left, MotorGroup right) {
		this.left = left;
		this.right = right;
	}

	public TankDrive(MotorGroup left, MotorGroup right, Gyro gyro) {
		this.left = left;
		this.right = right;
		this.gyro = gyro;
		this.gyro.reset(); //1683 has this commented out
	}
	
	@Override
	public void set(double speed) {
		left.set(speed);
		right.set(speed);
	}

	public void setLeft(double speed) {
		left.set(speed);
	}

	public void setRight(double speed) {
		right.set(speed);
	}

	public void set(double leftSpeed, double rightSpeed) {
		left.set(leftSpeed);
		right.set(rightSpeed);
	}

	public void turnInPlace(boolean right, double speed) {
		if (right) {
			set(speed, -speed);
		} else {
			set(-speed, speed);
		}
	}

	@Override
	public void stop() {
		left.enableBrakeMode(true);
		right.enableBrakeMode(true);
		left.stop();
		right.stop();
	}

	@Override
	public void coast() {
		left.enableBrakeMode(false);
		right.enableBrakeMode(false);
		left.stop();
		right.stop();
	}

	public void driveMode(double leftSpeed, double rightSpeed) {
		left.enableBrakeMode(false);
		right.enableBrakeMode(false);

		left.set(leftSpeed);
		right.set(rightSpeed);
	}

	@Override
	public Encoder getLeftEncoder() {
		return left.getEncoder();
	}

	@Override
	public Encoder getRightEncoder() {
		return right.getEncoder();
	}


	public void resetEncoders() {
		left.getEncoder().reset();
		right.getEncoder().reset();
	}

	@Override
	public MotorGroup getLeftGroup() {
		return left;
	}

	@Override
	public MotorGroup getRightGroup() {
		return right;
	}
	
	public Gyro getGyro() {
		return gyro;
	}

	public boolean hasGyro() {
		return !(gyro == null);
	}
	
	
}
