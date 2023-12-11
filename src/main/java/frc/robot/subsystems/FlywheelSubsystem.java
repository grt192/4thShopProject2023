package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.XboxController;


import static frc.robot.Constants.flywheelConstants.*;

public class FlywheelSubsystem extends SubsystemBase{
    private final CANSparkMax wheelmotor;
    private boolean running = false;

    public FlywheelSubsystem(){
        wheelmotor = new CANSparkMax(WHEEL_MOTOR_ID, MotorType.kBrushless);
    }
    
    public void periodic(){
        if(running){
            wheelmotor.set(FLYSPEED);
        }
        else wheelmotor.set(0);

    }
    
    public void setFlywheel(boolean on){
        running = on;
    }
}
