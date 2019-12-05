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
    public static final int 
        DRIVE_LEFT_MASTER_ID  = 1,
        DRIVE_RIGHT_MASTER_ID = 3,
        DRIVE_LEFT_SLAVE_ID   = 2,
        DRIVE_RIGHT_SLAVE_ID  = 4;

    //mast motor IDs
    public static final int 
        MAST_RIGHT_PINION_ID = 5,
        MAST_LEFT_PINION_ID  = 6,
        MAST_SCREW_ID        = 7;

    //manipulator motor IDs
    public static final int 
        MANIPULATOR_RIGHT_MOTOR_ID = 8,
        MANIPULATOR_LEFT_MOTOR_ID  = 9;

    //clamp solenoid ID
    public static final int 
        CLAMP_SOLENOID_ID = 6;

    //mast limit IDs but don't actually worry about limit switches for now I still have to test those
    public static final int
        MAST_OUTER_LIMIT_ID = 0,
        MAST_INNER_LIMIT_ID = 0;

    //mast motor inverts
    public static final boolean
        MAST_RIGHT_INVERT = false,
        MAST_LEFT_INVERT = true,
        MAST_SCREW_INVERT = false;
    public static final  boolean
        DRIVE_LEFT_MASTER_INVERT = false,
        DRIVE_LEFT_SLAVE_INVERT = false,
        DRIVE_RIGHT_SLAVE_INVERT = true,
        DRIVE_RIGHT_MASTER_INVERT = true; 
    }
