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
    public static final int kMechControllerPort = 1;
  }

  public static class DrivetrainConstants {
    /* CAN Link IDs */
    public static final int RIGHT_BACK_MOTOR_ID  = 0;
    public static final int RIGHT_FRONT_MOTOR_ID = 1;
    public static final int LEFT_BACK_MOTOR_ID   = 2;
    public static final int LEFT_FRONT_MOTOR_ID  = 3;

    /* Motor Speed Scaling */
    public static final double THROTTLE_SCALE = 0.5;
    public static final double TURN_SCALE = 0.25;
  }
  public static class FlywheelConstants{
    public static final int WHEEL_MOTOR_ID = 2;
    public static final int CONTROLLER_ID = 0;
    public static final double FLYSPEED = 0.53;
  }
}
