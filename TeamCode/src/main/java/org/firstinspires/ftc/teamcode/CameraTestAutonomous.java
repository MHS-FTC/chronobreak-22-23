package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.macrobotics.cfcl.opmode.CFClOpMode;
import org.macrobotics.cfcl.robot.module.WebcamModule;

@Autonomous(name = "Camera Test")
public class CameraTestAutonomous extends CFClOpMode<ChronobreakRobotConfig> {
    @Override
    public ChronobreakRobotConfig createRobot() {
        return new ChronobreakRobotConfig(hardwareMap);
    }

    @Override
    public void update() {
        robot.getModule(WebcamModule.class).getWebcam();
    }
}
