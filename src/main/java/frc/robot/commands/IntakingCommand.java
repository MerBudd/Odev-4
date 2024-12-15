// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Feeder;
import frc.robot.subsystems.Intake;

public class IntakingCommand extends Command {
  Intake m_intake;
  double m_intakespeed;

  Feeder m_feeder;
  double m_feederspeed;

  public IntakingCommand(Intake intake, double speed_intake, Feeder feeder, double speed_feeder) {
    this.m_intake = intake;
    this.m_intakespeed = speed_intake;
    this.m_feeder = feeder;
    this.m_feederspeed = speed_feeder;
    addRequirements(m_intake, m_feeder);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    if (m_intake.getIntakeSensor()) {
      m_intake.setIntake(0);
    } else if (m_feeder.getFeederSensor()) {
        m_feeder.setFeeder(0);
      } else {
      m_intake.setIntake(m_intakespeed);
      m_feeder.setFeeder(m_feederspeed);
    }
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}