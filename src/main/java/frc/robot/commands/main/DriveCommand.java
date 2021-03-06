// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.main;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.OI;
import frc.robot.Robot;

public class DriveCommand extends CommandBase {

  public DriveCommand() {
    addRequirements(Robot.DriveSubsystem);
  }

  @Override
  public void execute() {
    Robot.DriveSubsystem.ArcadeDrive(OI.getDrivingSpeed(), OI.getDrivingTurn());
  }

  @Override
  public void end(boolean interrupted) {
    Robot.DriveSubsystem.ArcadeDrive(0, 0); // stop
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
