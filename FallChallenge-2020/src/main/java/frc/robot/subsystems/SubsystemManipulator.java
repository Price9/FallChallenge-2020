/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The manipulator, which consists of two motors that spin opposite of each other.
 */
public class SubsystemManipulator extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public SubsystemManipulator() {
    
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  /**
   * Sucks the cubes in. This should happen when A is pressed.
   */
  public void eat() {

  }

  /**
   * Pushes the cubes out. This should happen when Y is pressed.
   */
  public void spit() {

  }
}
