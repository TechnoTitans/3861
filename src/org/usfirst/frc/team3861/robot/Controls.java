package org.usfirst.frc.team3861.robot;

import java.util.ArrayList;

import org.usfirst.frc.team3861.constants.HWR;
import org.usfirst.frc.team3861.driveTrain.DriveTrain;
import org.usfirst.frc.team3861.driverStation.DriverSetup;
import org.usfirst.frc.team3861.scoring.Door;
import org.usfirst.frc.team3861.scoring.Shooter;

public class Controls {
	
	DriveTrain drive;
	Shooter shooter;
	Door door;

	private double rSpeed;
	private double lSpeed;
	private double doorSpeed;
	private double maxPower = 1.0;
	private boolean pushShooter;
	private boolean pullShooter;

	private final double MAX_JOYSTICK_SPEED = 0.5;
	private final double SECOND_JOYSTICK_SPEED = 0.35;
	

	public Controls(DriveTrain drive, Shooter shooter, Door door) {
		
		this.drive = drive;
		
	}
	
	public void run() {
		
		lSpeed = maxPower * DriverSetup.rightStick.getRawAxis(DriverSetup.YAxis);
		rSpeed = maxPower * DriverSetup.leftStick.getRawAxis(DriverSetup.YAxis);
		doorSpeed = DriverSetup.auxStick.getRawAxis(DriverSetup.YAxis);
		
		drive.driveMode(lSpeed, rSpeed);
		door.run(doorSpeed);
		
		pushShooter = DriverSetup.auxStick.getRawButton(HWR.PUSH_SHOOTER);
		pullShooter = DriverSetup.auxStick.getRawButton(HWR.PULL_SHOOTER);
		
		if (pushShooter)
			shooter.pushOutShooter();
		
		if (pullShooter)
			shooter.pullInShooter();

	}
}
