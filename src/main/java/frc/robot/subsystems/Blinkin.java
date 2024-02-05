// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class Blinkin {

  Spark Blinkin;

  public Blinkin() {
    Blinkin = new Spark(Constants.Electrical.lights);
  }

  public void lightsAuto() {
    Blinkin.set(.61);
  }

  public void lightsLineUp() {
    Blinkin.set(0);
  }

  public void lightsTeam() {
    Blinkin.set(0);
  }

  public void lightsHang() {
    Blinkin.set(0);
  }
}