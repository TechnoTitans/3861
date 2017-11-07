package org.usfirst.frc.team3861.scoring;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;


public class Shooter {
	
	Solenoid solenoid;
	boolean isShooting = true;
	boolean hasDoneFirstShot = false;
	

	Timer timer = new Timer();
	public static final double DELAY = 3.0;
	
	@SuppressWarnings("unused")
	private Shooter() {}
	
	public Shooter(int channel) {
		solenoid = new Solenoid(channel);
	}
	
	public void pushOutShooter() {
		solenoid.set(true);
		timer.start();
	}
	
	public void pullInShooter() { 
		if(timer.get() >= DELAY) {
			solenoid.set(false);
			timer.stop();
			timer.reset();
			timer.start();
		}
		
	}
	
	/*
	 * 
		if (timer.get() >= DELAY) {
			isShooting = false;
			timer.reset();
		}
		 
		if (isShooting) {
			solenoid.set(true);
			timer.start();
		} else {
			solenoid.set(false);
		}		
		
	 */
	
}
