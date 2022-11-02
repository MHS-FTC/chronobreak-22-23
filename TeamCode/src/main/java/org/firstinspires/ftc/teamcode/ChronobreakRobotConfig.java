package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.macrobotics.cfcl.robot.Behavior;
import org.macrobotics.cfcl.robot.Module;
import org.macrobotics.cfcl.robot.RobotConfig;
import org.macrobotics.cfcl.robot.behavior.CvBehavior;
import org.macrobotics.cfcl.robot.module.MecanumDriveModule;
import org.macrobotics.cfcl.robot.module.WebcamModule;

import java.util.Collection;

public class ChronobreakRobotConfig extends RobotConfig {
    public ChronobreakRobotConfig(HardwareMap h) {
        super(h);
    }

    @Override
    public void addModules(Collection<Module> moduleList) {
        moduleList.add(new MecanumDriveModule(getHardwareMap(),
                "left_front", "left_back", "right_front", "right_back"));

        moduleList.add(new WebcamModule(getHardwareMap(), "webcam"));
    }

    @Override
    public void addBehaviours(Collection<Behavior> behaviorList) {
        behaviorList.add(new CvBehavior(getModule(WebcamModule.class), null));
    }
}
