// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc810.MecanumDrive.subsystems;

import org.usfirst.frc810.MecanumDrive.RobotMap;
import org.usfirst.frc810.MecanumDrive.commands.*;
import edu.wpi.first.wpilibj.Servo;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Camera extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Servo pan = RobotMap.cameraPan;
    private final Servo tilt = RobotMap.cameraTilt;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void setPanAbsolute(double set){
    	pan.set(set);
    }
    
    public void setTiltAbsolute(double set){
    	tilt.set(set);
    }
    
    public void setPanRelative(double set){
    	pan.set(pan.get()+set);
    }

    public void setTiltRelative(double set){
    	tilt.set(tilt.get()+set);
    }
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new ControlCamera(.007));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}

