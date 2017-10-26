package org.usfirst.frc.team3861.driverStation;

import org.usfirst.frc.team3861.constants.HWR;

import edu.wpi.first.wpilibj.Joystick;

public class DriverSetup {
	// the axis the joystick can be rotated
	public static final int YAxis = 1;

	// joysticks
	public static Joystick leftStick = new Joystick(HWR.LEFT_JOYSTICK);
	public static Joystick rightStick = new Joystick(HWR.RIGHT_JOYSTICK);

}
