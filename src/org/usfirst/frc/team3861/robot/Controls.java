package org.usfirst.frc.team3861.robot;

import org.usfirst.frc.team3861.driveTrain.DriveTrain;
import org.usfirst.frc.team3861.driverStation.DriverSetup;
import org.usfirst.frc.team3861.driveTrain.TankDrive;

public class Controls {
	DriveTrain drive;

	private double rSpeed;
	private double lSpeed;
	private double maxPower = 1.0;

	private final double MAX_JOYSTICK_SPEED = 0.5;
	private final double SECOND_JOYSTICK_SPEED = 0.35;

	public Controls(DriveTrain drive) {
		
		this.drive = drive;
		
	}
	
	public void run() {
		
		lSpeed = maxPower * DriverSetup.rightStick.getRawAxis(DriverSetup.YAxis);
		rSpeed = maxPower * DriverSetup.leftStick.getRawAxis(DriverSetup.YAxis);
		
		drive.driveMode(lSpeed, rSpeed);
	}
}
