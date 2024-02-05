// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.LimelightHelpers;
import frc.robot.Constants.AimConstants;

public class AimAuto extends SubsystemBase {
  /** Creates a new AimAuto. */
  public AimAuto() {}

  @Override
  public void periodic() {
    double tz = LimelightHelpers.getCameraPose3d_TargetSpace("").getZ();
    
  }
}
