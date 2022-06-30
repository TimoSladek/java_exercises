package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private String sensor;

    public TemperatureSensor(){
        this.sensor = "off";
    }

    @Override
    public boolean isOn() {
        return this.sensor.equals("on");
    }

    @Override
    public void setOn() {
        this.sensor = "on";
    }

    @Override
    public void setOff() {
        this.sensor = "off";
    }

    @Override
    public int read() {
        if (isOn()){
            return new Random().nextInt(61)-30;
        }
        throw new IllegalStateException("turn it on");
    }
}
