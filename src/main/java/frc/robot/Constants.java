// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static class AimConstants {
    public static final double y2 = 1.450975; //Height of AprilTag to ground (meters) (57.125 inches)
    public static final double y1 = .508; //Height of Camera to ground (meters) (20 inches)
    public static final double deltay = y2 - y1;
    public static final double error = 0.25;
    public static final double y3 = 0.5345684 + error;
  }
  public static class Electrical {
    public static final int lights = 0;
  }
}
