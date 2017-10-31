package org.usfirst.frc.team3861.driveTrain;

import org.usfirst.frc.team3861.constants.HWR;
import org.usfirst.frc.team3861.sensors.Gyro;

public class AntiDrift {
	TankDrive drive;
	Gyro gyro;
	double defaultSpeed = 0.15;
	double angle = gyro.getAngle();
	double leftSpeed = -angle/1.8;
	double rightSpeed = angle/1.8;
	
	public AntiDrift(TankDrive drive, Gyro gyro) {
		gyro = new Gyro(HWR.GYRO);
		leftSpeed = -angle/1.8;
		rightSpeed = angle/1.8;
		drive.setRight(defaultSpeed+rightSpeed);
		drive.setLeft(defaultSpeed+leftSpeed);
	}
}
