package org.usfirst.frc.team3861.robot;

import org.usfirst.frc.team3861.autonomous.AutonomousRunner;
import org.usfirst.frc.team3861.constants.HWR;
import org.usfirst.frc.team3861.driveTrain.TankDrive;
import org.usfirst.frc.team3861.motors.MotorGroup;
import org.usfirst.frc.team3861.motors.TalonSRX;
import org.usfirst.frc.team3861.sensors.Gyro;
import org.usfirst.frc.team3861.vision.VisionReader;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Team3861 extends IterativeRobot {

	TankDrive drive;
	Controls controls;
	
	Gyro gyro;
	MotorGroup leftGroup;
	MotorGroup rightGroup;
	
	VisionReader vision;
	AutonomousRunner autonomous;
	
	// TODO !!!!!!!
	// fix port numbers in constant class; get from electrical
	// TODO !!!!!!!
	
	@Override
	public void robotInit() {
		gyro = new Gyro(HWR.GYRO);

		TalonSRX rightFrontTalon = new TalonSRX(HWR.RIGHT_DRIVE_TRAIN_FRONT, false);
		TalonSRX rightBackTalon = new TalonSRX(HWR.RIGHT_DRIVE_TRAIN_BACK, false);
		TalonSRX leftFrontTalon = new TalonSRX(HWR.LEFT_DRIVE_TRAIN_FRONT, false);
		TalonSRX leftBackTalon = new TalonSRX(HWR.LEFT_DRIVE_TRAIN_BACK, false);
		
		vision = new VisionReader();
		
		//TODO add the QuadEncoders once we finish
		leftGroup = new MotorGroup(leftFrontTalon, leftBackTalon);
		rightGroup = new MotorGroup(rightFrontTalon, rightBackTalon);
		
		drive = new TankDrive(leftGroup, rightGroup, gyro);
		
		//TODO write and then enable the antidrifts here
		
		controls = new Controls(drive);
		
	}

	// TODO implement autonomous code
	// once we are finished with 
	
	@Override
	public void autonomousInit() {
		autonomous = new AutonomousRunner(drive);
	}

	@Override
	public void autonomousPeriodic() {

	}

	@Override
	public void teleopInit() {

	}

	@Override
	public void teleopPeriodic() {
		controls.run();
	}
}
