

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Wing extends SubsystemBase {

  private final WPI_VictorSPX TwoWing = new WPI_VictorSPX(Constants.Wing_TwoWing);
  private final WPI_VictorSPX Middle = new WPI_VictorSPX(Constants.Wing_middle);
  private String status = "stoooooooop";
  public Wing(){
    TwoWing.configNeutralDeadband(0.01);
    TwoWing.configPeakOutputForward(0.8);
    TwoWing.configPeakOutputReverse(-0.8);
    TwoWing.setNeutralMode(NeutralMode.Coast);

    Middle.configNeutralDeadband(0.01);
    Middle.configPeakOutputForward(0.8);
    Middle.configPeakOutputReverse(-0.8);
    Middle.setNeutralMode(NeutralMode.Coast);

    Middle.setInverted(true);
    TwoWing.setInverted(true);

    Shuffleboard.getTab("Statue").add("Wing", status);
  }
  public String getstatus(){
    return status;
  }
  
  
  public void Forward(){
    TwoWing.set(ControlMode.PercentOutput,0.5);
    Middle.set(ControlMode.PercentOutput,0.5);
    status = "Enggggggggggggggggggggggggageeeeeeee!!!";
  }

  public void Stop(){
    TwoWing.set(ControlMode.PercentOutput,0);
    Middle.set(ControlMode.PercentOutput,0);
    status = "stoooooooop！";
  }

  public void Reverse(){
    TwoWing.set(ControlMode.PercentOutput,-0.5);
    Middle.set(ControlMode.PercentOutput,-0.5);
    status = "Retreeeeeeeeeeeeeeeeeeeeeeeeat!!!";
  }
}