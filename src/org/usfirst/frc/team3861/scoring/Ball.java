package org.usfirst.frc.team3861.scoring;


@Deprecated
public class Ball {
	
	Flywheel flywheel;
	Belt belt;
	
	public Ball(Flywheel flywheel, Belt belt) {
		this.flywheel = flywheel;
		this.belt = belt;
	}
	
	//only works for teleop
	public void intake() {
		belt.setSpeed(.6); //TODO find real speed
		belt.turnOn();
	}
	
	public void stopIntake() {
		belt.stop();
	}

	public void shoot() {
		belt.setSpeed(.6); //TODO find speed
		belt.turnOn(); 
		flywheel.setSpeed(.7); //TODO find speed
		flywheel.turnOn();
	}
	
	public void stopShoot() {
		flywheel.stop();
		belt.stop();
	}

}
