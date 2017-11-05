package org.usfirst.frc.team3861.vision;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class VisionReader {
	
	NetworkTable table;
	
	public void init() {
		NetworkTable.setClientMode();
		table = NetworkTable.getTable("vision");
	}
	
	public double getDistance() {
		return (double) table.getNumber("distance", 0.0);
	}
	
	public double getAngle() {
		return (double) table.getNumber("angle", 0.0); 
	}
}
