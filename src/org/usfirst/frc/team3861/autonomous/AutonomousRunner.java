package org.usfirst.frc.team3861.autonomous;

import org.usfirst.frc.team3861.driveTrain.TankDrive;
import org.usfirst.frc.team3861.scoring.Shooter;

public class AutonomousRunner {
	
	// TODO code this to implement our autonomous strategy
	// for now, this contains basic code that doesn't do much, but is more of an example
	@SuppressWarnings("unused")
	private AutonomousRunner() {}
	
	private TankDrive drive;
	private double distance;
	private Shooter shooter;
	private static final double MAX_DISTANCE = 12 * 6 ; // 6 feet = 72 in is a random 
	
	public AutonomousRunner(TankDrive drive, Shooter shooter) {
		this.drive = drive;
		this.shooter = shooter;
	}
	
	public void run() {
		distance = drive.getRightEncoder().getDistance();
		drive.set(0.4);
		if(distance >= MAX_DISTANCE) {
			drive.stop();
			shooter.pushOutShooter();
		}
	}
	
	
}
