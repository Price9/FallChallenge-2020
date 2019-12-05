/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Constants;
import frc.robot.commands.ManualCommandDrive;
import frc.robot.util.Xbox;

/**
 * The Subsystem class for the drivetrain. All methods and objects required for driving the robot should be put 
 * here (so motor controllers and stuff). DriveTankByJoystick() will be called periodically by ManualCommandDrive
 * while the robot is ENABLED.
 */
public class SubsystemDrive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private TalonSRX
    leftMaster,
    leftSlave,
    rightMaster,
    rightSlave;

  public SubsystemDrive() {
    leftMaster = new TalonSRX(Constants.DRIVE_LEFT_MASTER_ID);
    leftSlave = new TalonSRX(Constants.DRIVE_LEFT_SLAVE_ID);
    rightMaster = new TalonSRX(Constants.DRIVE_RIGHT_MASTER_ID);
    rightSlave = new TalonSRX(Constants.DRIVE_RIGHT_SLAVE_ID);
    setInverts();
  }

  @Override
  public void initDefaultCommand() {
    /**
     * Small note: for subsystems that should be running at all times during teleop (such as the drivetrain), 
     * you will need to set a "default command" that is called  while the robot is running. This command is 
     * defined and paired to this substem below with the setDefaultCommand() method. So in order for ManualCommandDrive 
     * to run, it has to be paired to this subsystem below, otherwise the robot will never respond to controller input.
     * 
     * This ones for free broskis, y'all have to do the rest
     */

    // Set the default command for a subsystem here.
    setDefaultCommand(new ManualCommandDrive());
  }

public void setInverts() {
  leftMaster.setInverted(Constants.DRIVE_LEFT_MASTER_INVERT);
  leftSlave.setInverted(Constants.DRIVE_LEFT_SLAVE_INVERT);
  rightMaster.setInverted(Constants.DRIVE_RIGHT_MASTER_INVERT);
  rightSlave.setInverted(Constants.DRIVE_RIGHT_SLAVE_INVERT);
}
  /**
   * Drives the robot based on controller input
   * Right trigger is forward, left trigger is backward, left joystick steers.
   * @param controller the XBox controller to pull input from (OI.DRIVER or OI.OPERATOR)
   */
  public void DriveTankByController(Joystick controller) {
    double throttle = Xbox.RT(controller) - Xbox.LT(controller);
    double steering = Xbox.LEFT_X(controller);

    double driveRight = throttle - steering;
    double driveLeft = throttle + steering; 
    
    driveRight = (driveRight < -1 ? -1 : (driveRight > 1 ? 1 : driveRight));
    driveLeft = (driveLeft < -1 ? -1 : (driveLeft > 1 ? 1 : driveRight));
  }

  public void setMotors(double left, double right){
    leftMaster.set(ControlMode.PercentOutput, left);
    leftSlave.set(ControlMode.PercentOutput, left);
    rightMaster.set(ControlMode.PercentOutput, right);
    rightSlave.set(ControlMode.PercentOutput, right);
  }
}
