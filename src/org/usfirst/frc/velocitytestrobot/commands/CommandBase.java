/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.velocitytestrobot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.velocitytestrobot.OI;

/**
 * An example command.  You can replace me with your own command.
 */
public abstract class CommandBase extends Command {
	public static OI oi;
	public CommandBase(String name) {
		super(name);
	}
	
	public CommandBase() {
		super();
	}

	public static void init() {
		oi = new OI();
	}
}
