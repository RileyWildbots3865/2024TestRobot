// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.LimelightHelpers;
import frc.robot.Constants.AimConstants;

public class AimAuto extends SubsystemBase {
  /** Creates a new AimAuto. */
  double deltay = AimConstants.deltay;
  double newdeltay = deltay + AimConstants.y3;

  public double GetAngle() {
    double a = Math.abs(LimelightHelpers.getCameraPose3d_TargetSpace("").getZ());
    double theta = Math.atan(newdeltay/a) * (180/ Math.PI);
    double round = ((1/8.0) * Math.round(8*theta));
    return round;
  } 


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
