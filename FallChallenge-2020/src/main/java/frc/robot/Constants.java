/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class is used to enumerate numbers that won't change.
 * Motor IDs, Solenoid IDs, and default dashboard values are stored here.
 */
public class Constants {
    
    //drivetrain motor IDs
    public static int 
        DRIVE_LEFT_MASTER_ID  = 0,
        DRIVE_RIGHT_MASTER_ID = 0,
        DRIVE_LEFT_SLAVE_ID   = 0,
        DRIVE_RIGHT_SLAVE_ID  = 0;

    //mast motor IDs
    public static int 
        MAST_RIGHT_PINION_ID = 0,
        MAST_LEFT_PINION_ID  = 0,
        MAST_SCREW_ID        = 0;  

    //manipulator motor IDs
    public static int 
        MANIPULATOR_RIGHT_MOTOR_ID = 0,
        MANIPULATOR_LEFT_MOTOR_ID  = 0;

    //clamp solenoid ID
    public static int 
        CLAMP_SOLENOID_ID = 0;
}
