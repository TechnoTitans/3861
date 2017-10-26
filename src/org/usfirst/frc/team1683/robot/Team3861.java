package org.usfirst.frc.team1683.robot;

import org.usfirst.frc.team1683.constants.HWR;
import org.usfirst.frc.team1683.driveTrain.TankDrive;
import edu.wpi.first.wpilibj.IterativeRobot;
import org.usfirst.frc.team1683.motors.MotorGroup;
import org.usfirst.frc.team1683.motors.TalonSRX;
import org.usfirst.frc.team1683.sensors.Gyro;

public class Team3861 extends IterativeRobot {

	TankDrive drive;
	Controls controls;
	
	Gyro gyro;
	MotorGroup leftGroup;
	MotorGroup rightGroup;
	
	// TODO !!!!!!!
	// fix port numbers in constant class; get from electrical
	// TODO !!!!!!!
	
	
	public void robotInit() {
		gyro = new Gyro(HWR.GYRO);
		TalonSRX rightFrontTalon = new TalonSRX(HWR.RIGHT_DRIVE_TRAIN_FRONT, false);
		TalonSRX rightMiddleTalon = new TalonSRX(HWR.RIGHT_DRIVE_TRAIN_MIDDLE, false);
		TalonSRX rightBackTalon = new TalonSRX(HWR.RIGHT_DRIVE_TRAIN_BACK, false);
		TalonSRX leftFrontTalon = new TalonSRX(HWR.LEFT_DRIVE_TRAIN_FRONT, false);
		TalonSRX leftFrontTalon = new TalonSRX(HWR.LEFT_DRIVE_TRAIN_MIDDLE, false);
		TalonSRX leftBackTalon = new TalonSRX(HWR.LEFT_DRIVE_TRAIN_BACK, false);
		
		
		//TODO add the QuadEncoders once we finish
		leftGroup = new MotorGroup(leftFrontTalon, leftBackTalon);
		rightGroup = new MotorGroup(rightFrontTalon, rightBackTalon);
		
		//TODO write and then enable the antidrifts here
		controls = new Controls(drive);
		
	}

	// TODO implement autonomous code
	// once we are finished with 
	public void autonomousInit() {
		
	}

	public void autonomousPeriodic() {

	}

	public void teleopInit() {

	}

	public void teleopPeriodic() {
		controls.run();
	}
}
