package org.usfirst.frc.team1683.driveTrain;

import org.usfirst.frc.team1683.motors.MotorGroup;
import org.usfirst.frc.team1683.sensors.Encoder;

public interface DriveTrain {
	
	public void set(double speed);

	public void stop();

	public void coast();
	
	public Encoder getLeftEncoder();

	public Encoder getRightEncoder();

	public MotorGroup getLeftGroup();

	public MotorGroup getRightGroup();

	public void driveMode(double lSpeed, double rSpeed);

}