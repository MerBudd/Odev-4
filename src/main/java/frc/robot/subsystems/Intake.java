// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  public TalonFX intakeMotor;
  public DigitalInput intakeSensor;

  public Intake() {
    intakeMotor = new TalonFX(1);
    intakeSensor = new DigitalInput(1);
  }

  public void setIntake(double speed) {
    intakeMotor.set(speed);
  }

  public boolean getIntakeSensor() {
    return intakeSensor.get();
  }

  @Override
  public void periodic() {
  }
}