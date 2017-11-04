package org.usfirst.frc.team3861.scoring;

import edu.wpi.first.wpilibj.Solenoid;

public class Shooter {
	
	Solenoid solenoid;
	
	
	private Shooter() {}
	
	public Shooter(int channel) {
		solenoid = new Solenoid(channel);
	}
	
	public void shoot() {
		// pump, then retract
		solenoid.set(true);
		// maybe add a delay because it might go to fast
		solenoid.set(false);		
	}
	
}
