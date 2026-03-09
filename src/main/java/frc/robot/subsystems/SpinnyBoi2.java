package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.thethriftybot.devices.ThriftyNova;
import com.thethriftybot.devices.ThriftyNova.CurrentType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SpinnyBoi2 extends SubsystemBase {
    public final ThriftyNova  m_feed = new ThriftyNova (5);
    public final SparkMax  m_intake_shooter = new SparkMax(6, MotorType.kBrushed);

    public SpinnyBoi2() {
        // SparkMaxConfig has no constructor taking an ID — use default and configure if needed
        m_feed.setMaxCurrent(CurrentType.STATOR, 60)
               .setBrakeMode(true);

        final SparkMaxConfig kFeedConfigs = new SparkMaxConfig();
        kFeedConfigs.smartCurrentLimit(80);
    }
}
