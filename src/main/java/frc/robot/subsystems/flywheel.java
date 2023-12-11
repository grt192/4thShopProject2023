package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.XboxController;


import static frc.robot.Constants.flywheelConstants.*;

public class flywheel extends SubsystemBase{
    private final CANSparkMax wheelmotor;
    private final XboxController controller;

    public flywheel(){
        wheelmotor = new CANSparkMax(WHEEL_MOTOR_ID, MotorType.kBrushless);
        controller = new XboxController(CONTROLLER_ID);
    }
    
    public void periodic(){
        if(controller.getRightBumperPressed())
            wheelmotor.set(FLYSPEED);
        
        if(controller.getRightBumperReleased())
            wheelmotor.set(0);

    }    
}
