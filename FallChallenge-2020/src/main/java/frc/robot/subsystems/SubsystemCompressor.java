/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Compressor;


/**
 * The pneumatic compressor that supplies air pressure to the pistons and things.
 */
public class SubsystemCompressor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private Compressor compressor;

  public SubsystemCompressor() {
    compressor = new Compressor();
    compressor.start();
  }

  @Override
  public void initDefaultCommand() {
  }

  public void setEnabled(boolean running) {
    if(!running) {
      compressor.stop();
    } else {
      compressor.start();
    }
  }

  public boolean pressureSwitchTriggered() {
    return compressor.getPressureSwitchValue();
  }
}
