interface Sensor {
    void readTemperature(double temp);
    double getTemperature();
}
class TemperatureSensor implements Sensor {
    private double temperature;

    public void readTemperature(double temp) {
        this.temperature = temp;
        System.out.println("Temperature read: " + temp + "°C");
    }

    public double getTemperature() {
        return temperature;
    }
}
public class SensorApp {
    public static void main(String[] args) {
        Sensor sensor = new TemperatureSensor(); // using interface reference

        sensor.readTemperature(25.6);
        System.out.println("Current Temperature: " + sensor.getTemperature() + "°C");
    }
}
