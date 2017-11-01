package org.usfirst.frc.team3861.vision;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class VisionReader {
	
	NetworkTable table;
	
	public void init() {
		NetworkTable.setClientMode();
//		NetworkTable.setIPAddress("0.0.0.0"); // TODO find real ip address
		table = NetworkTable.getTable("vision");
	}
	
	public double getDistance() {
		return (double) table.getValue("distance", 0.0);
	}
}
