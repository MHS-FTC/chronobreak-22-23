package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.macrobotics.cfcl.math.Util;
import org.macrobotics.cfcl.opmode.CFClOpMode;
import org.macrobotics.cfcl.robot.module.DriveModule;

@TeleOp(name = "Basic Teleop")
public class BasicTeleop extends CFClOpMode<ChronobreakRobotConfig> {
    @Override
    public ChronobreakRobotConfig createRobot() {
        return new ChronobreakRobotConfig(hardwareMap);
    }

    @Override
    public void update() {
        robot.getModule(DriveModule.class).setDriveDirection(Util.getGamepadInput(gamepad1));
    }
}
