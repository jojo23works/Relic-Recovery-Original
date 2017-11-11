package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by mingch on 9/9/17.
 */

@TeleOp(name = "ColorArmTest")
public class ColorArmTest extends LinearOpMode
{
    private Servo ColorArm;

    @Override
    public void runOpMode () throws InterruptedException
    {
        ColorArm = hardwareMap.servo.get("ColorArm");

        waitForStart();

        while(opModeIsActive())
        {
                ColorArm.setPosition(1);
            sleep(1000);
                ColorArm.setPosition(0.4);
            sleep(1000);


            idle();
        }
    }

}
