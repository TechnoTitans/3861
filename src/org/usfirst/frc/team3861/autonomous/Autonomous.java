package org.usfirst.frc.team3861.autonomous;

import org.usfirst.frc.team3861.driveTrain.TankDrive;
import org.usfirst.frc.team3861.sensors.Encoder;

public class Autonomous {
	
	TankDrive drive;
	Encoder leftEncoder;
	Encoder rightEncoder;

	
	public Autonomous(TankDrive tankDrive) {
		this.drive = tankDrive;
		leftEncoder = tankDrive.getLeftEncoder();
		rightEncoder = tankDrive.getRightEncoder();
	}
	
	public void run() {
		
		drive.set(.7);
		
		if (leftEncoder.getDistance() > 10) { //find real value
			drive.stop();
		}
		
		
	}

}
