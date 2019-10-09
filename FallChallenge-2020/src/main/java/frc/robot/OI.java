/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * The OI is where the two XBox controllers (or other controllers) are referenced, and some control is assigned.
 * Commands that run on buttons (not joysticks or triggers) will be linked here
 * Joystick control is defined in it's own command
 */
public class OI {
    public static Joystick DRIVER = new Joystick(0);
    public static Joystick OPERATOR = new Joystick(1);

    /**
     * If there are any commands linked to buttons, link them in this constructor.
     */
    public OI() {
    }
}
