// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import frc.robot.Constants.Extra;

public class subShooter extends SubsystemBase {
  /** Creates a new subShooter. */
  public CANSparkMax topLeftMotor;
  public CANSparkMax topRightMotor;
  public CANSparkMax bottomLeftMotor;
  public CANSparkMax bottomRightMotor;

  public subShooter() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
