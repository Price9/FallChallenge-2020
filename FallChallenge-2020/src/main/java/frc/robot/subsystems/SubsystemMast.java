/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.ManualCommandMoveMast;

/**
 * The mast, which includes the rack-n-pinion AND the screw.
 * The rack and pinion is TWO MOTORS that should spin opposite of each other!!!
 * The screw is one motor.
 * See SubsystemDrive for the rundown of how the subsystems are laid out.
 */
public class SubsystemMast extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public SubsystemMast() {
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ManualCommandMoveMast());
  }

  public void SetInverts(boolean rightInvert, boolean leftInvert, boolean screwInvert) {
  }

  /**
   * Drives the mast using controls from the controller.
   * The outer mast should be controlled by the right joystick.
   * The inner mast should be controlled by the left joystick.
   * Keep in mind that there are limit switches!!
   * @param joy The controller that controls mast movement.
   */
  public void DriveByController(Joystick controller) {
  }
}
