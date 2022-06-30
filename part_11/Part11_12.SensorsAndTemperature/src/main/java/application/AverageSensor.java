package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> averageSensor;
    private List<Integer> temperatures;

    public AverageSensor() {
        this.averageSensor = new ArrayList<>();
        this.temperatures = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.averageSensor) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.averageSensor) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.averageSensor) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (this.averageSensor.isEmpty()) {
            throw new IllegalStateException("no sensors added");
        }
        for (Sensor sensor : this.averageSensor) {
            if (!sensor.isOn()) {
                throw new IllegalStateException("no sensors added");
            }
        }
        int sum = 0;
        for (Sensor sensor : this.averageSensor) {
            sum += sensor.read();
        }
        this.temperatures.add(sum / this.averageSensor.size());
        return sum / this.averageSensor.size();
    }

    public void addSensor(Sensor toAdd) {
        this.averageSensor.add(toAdd);
    }

    public List<Integer> readings() {
        return this.temperatures;
    }
}
