// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.DrivetrainConstants.*;

public class TankSubsystem extends SubsystemBase {
  /* Motors go vroom */
  private final WPI_TalonSRX leftMotor;
  private final WPI_TalonSRX leftMotorFollower;
  private final WPI_TalonSRX rightMotor;
  private final WPI_TalonSRX rightMotorFollower;

  /** Creates a new TankSubsystem. */
  public TankSubsystem() {
    /* Left Motors */
    leftMotor = new WPI_TalonSRX(LEFT_FRONT_MOTOR_ID);
    leftMotorFollower = new WPI_TalonSRX(LEFT_BACK_MOTOR_ID);
    leftMotor.setNeutralMode(NeutralMode.Brake);
    leftMotorFollower.follow(leftMotor);

    /* Right Motors */
    rightMotor = new WPI_TalonSRX(RIGHT_FRONT_MOTOR_ID);
    rightMotorFollower = new WPI_TalonSRX(RIGHT_BACK_MOTOR_ID);
    rightMotor.setNeutralMode(NeutralMode.Brake);
    rightMotor.setInverted(InvertType.InvertMotorOutput);
    rightMotorFollower.setInverted(InvertType.FollowMaster);
    rightMotorFollower.follow(rightMotor);
  }

  @Override
  public void periodic() {
    setMotors(0.5, 0.5);
  }

  /**
   * Sets the drivetrain motors' speeds.
   * 
   * @param leftSpeed
   * @param rightSpeed
   */
  public void setMotors(double leftSpeed, double rightSpeed) {
    leftMotor.set(leftSpeed);
    rightMotor.set(rightSpeed);
  }

  /* No touch */
  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a
   * digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public CommandBase exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }
}
