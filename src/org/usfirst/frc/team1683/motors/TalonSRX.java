package org.usfirst.frc.team1683.motors;

import edu.wpi.first.wpilibj.CANTalon;
import org.usfirst.frc.team1683.sensors.*;

public class TalonSRX extends CANTalon implements Motor {
	private Encoder encoder;
	
	//AntiDrift anti;
	
	Gyro gyro;
	
	/**
	 * Constructor for a TalonSRX motor
	 *
	 * @param channel
	 *            The port where the TalonSRX is plugged in.
	 * @param reversed
	 *            If the TalonSRX should invert the signal.
	 *TODO figure out what reversed does (with the TalonSRX)
	 */
	
	public TalonSRX(int channel, boolean reversed) {
		super(channel);
		super.setInverted(reversed);
	}
	
	
	public TalonSRX(int channel, boolean reversed, Encoder encoder) {
		super(channel);
		super.setInverted(reversed);

		this.encoder = encoder;
	}
	
	@Override
	public void setEncoder(Encoder encoder) {
		this.encoder = encoder;
	}

	@Override
	public void stop() {
		// do stuff
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void coast() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasEncoder() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Encoder getEncoder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getChannel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isReversed() {
		// TODO Auto-generated method stub
		return false;
	}
}
