// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Feeder extends SubsystemBase {
  /** Creates a new Feeder. */
  public TalonFX feederMotor;
  public DigitalInput feederSensor;

  public Feeder() {
    feederMotor = new TalonFX(2);
    feederSensor = new DigitalInput(0);
  }

  public void setFeeder(double speed) {
    feederMotor.set(speed);
  }

  public boolean getFeederSensor() {
    return feederSensor.get();
  }

  @Override
  public void periodic() {
  }
}