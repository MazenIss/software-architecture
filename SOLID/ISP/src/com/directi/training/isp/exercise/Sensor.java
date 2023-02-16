package com.directi.training.isp.exercise;

import java.util.Random;

public class Sensor
{
    public void register(ISensor isensor)
    {
        while (true) {
            if (isPersonClose()) {
                isensor.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
