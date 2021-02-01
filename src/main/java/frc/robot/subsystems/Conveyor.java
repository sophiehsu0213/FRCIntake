/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

//import frc.robot.Constants.PowCon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Conveyor extends SubsystemBase {
  private WPI_VictorSPX Conveyor = new WPI_VictorSPX(Constants.Conveyor);
  private String status = "stoooooooop";
  
  public Conveyor() {
    
    Conveyor.configNeutralDeadband(0.1);
    Conveyor.configPeakOutputForward(0.8);
    Conveyor.configPeakOutputReverse(-0.8);
    Conveyor.setNeutralMode(NeutralMode.Coast);
    
    Conveyor.setInverted(true);

    Shuffleboard.getTab("Statue").add("Conveyor", status);

  }

  public void Forward(){
    Conveyor.set(ControlMode.PercentOutput,0.5);
    status = "Enggggggggggggggggggggggggageeeeeeee!!!";
  }

  public void Stop(){
    Conveyor.set(ControlMode.PercentOutput,0);
    status = "stoooooooop！";
  }

  public void Reverse(){
    Conveyor.set(ControlMode.PercentOutput,-0.5);
    status = "Retreeeeeeeeeeeeeeeeeeeeeeeeat!!!";
  }
}
