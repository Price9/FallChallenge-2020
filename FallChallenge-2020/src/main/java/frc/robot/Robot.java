/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.SubsystemDrive;

/**
 * The main robot class. You really shouldn't have to modify anything in here if I did this right
 */
public class Robot extends TimedRobot {
  //subsystems
  public static SubsystemDrive SUB_DRIVE = new SubsystemDrive();

  /**
   * Called when the robot code starts
   */
  @Override
  public void robotInit() {
    DriverStation.reportWarning("ROBOT INIT", false);
    DriverStation.reportWarning("GOOD LUCK, HAVE FUN", false);
  }

  /**
   * Called periodically no matter the state of the robot(enabled, disabled, auto, test)
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * Called when auto starts
   */
  @Override
  public void autonomousInit() {
    DriverStation.reportWarning("AUTO STARTING! DON'T GET RUN OVER", false);
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
    Scheduler.getInstance().run();
  }
}
