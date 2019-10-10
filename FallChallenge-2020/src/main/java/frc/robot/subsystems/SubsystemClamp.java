/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The clamp that the manipulator is mounted on.
 */
public class SubsystemClamp extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public SubsystemClamp() {

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void setOpen(boolean open) {

  }

  public boolean getOpen() {
    return false;
  }
}
