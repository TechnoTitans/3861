package org.usfirst.frc.team3861.motors;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

import org.usfirst.frc.team3861.driveTrain.AntiDrift;
import org.usfirst.frc.team3861.sensors.*;

public class TalonSRX extends CANTalon implements Motor {
	private Encoder encoder;
	
	AntiDrift anti;
	
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
	
	public TalonSRX(int channel, boolean reversed, AntiDrift anti) {
		super(channel);
		super.setInverted(reversed);
		this.anti = anti;
	}
	
	public TalonSRX(int channel, boolean reversed, AntiDrift anti, Encoder encoder) {
		super(channel);
		super.setInverted(reversed);
		this.anti = anti;
		this.encoder = encoder;
	}
	
	/**
	 * Set the speed of the TalonSRX.
	 *
	 * @param speed
	 *            -- Speed from 0 to 1.
	 */
	@Override
	public void set(double speed) {
		super.changeControlMode(TalonControlMode.PercentVbus);
		super.set(speed);
		super.enableControl();
	}
	
	/**
	 * @return speed of TalonSRX in RPM
	 */
	
	@Override
	public double getSpeed() {
		return (super.getSpeed() * 60) / (4096 * 0.1);
	}
	@Override
	public void stop() {
		// super.enableBrakeMode(true);
		super.disableControl();
	}

	@Override
	public void brake() {
		super.enableBrakeMode(true);
		super.disableControl();
	}

	@Override
	public void coast() {
		super.enableBrakeMode(false);
		super.disableControl();
	}

	@Override
	public boolean hasEncoder() {
		return !(encoder == null);
	}

	@Override
	public Encoder getEncoder() {
		return encoder;
	}

	public void setEncoder(Encoder encoder) {
		this.encoder = encoder;
	}

	// TODO: make sure this works.
	@Override
	public int getChannel() {
		return super.getDeviceID();
	}

	@Override
	public double getError() {
		return super.getError();
	}

	@Override
	public boolean isReversed() {
		return super.getInverted();
	}
	

}
