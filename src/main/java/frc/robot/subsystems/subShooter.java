// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.Constants.Extra;

//public class subShooter extends SubsystemBase {
  /** Creates a new subShooter. */
  /* 
  public CANSparkMax leftFrontMotor;
  public CANSparkMax leftBackMotor;
  public CANSparkMax rightFrontMotor;
  public CANSparkMax rightBackMotor;

  public subShooter() {
    leftFrontMotor = new CANSparkMax(Extra.leftFrontMotor, MotorType.kBrushless);
    leftFrontMotor.restoreFactoryDefaults();
    
    leftBackMotor = new CANSparkMax(Extra.leftBackMotor, MotorType.kBrushless);
    leftBackMotor.restoreFactoryDefaults();
    leftBackMotor.follow(leftFrontMotor, false);

    rightFrontMotor = new CANSparkMax(Extra.rightFrontMotor, MotorType.kBrushless);
    rightFrontMotor.restoreFactoryDefaults();
    
    rightBackMotor = new CANSparkMax(Extra.rightBackMotor, MotorType.kBrushless);
    rightBackMotor.restoreFactoryDefaults();
    rightBackMotor.follow(rightFrontMotor, false);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
*/