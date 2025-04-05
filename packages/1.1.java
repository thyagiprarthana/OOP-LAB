import conversion.TemperatureConverter;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        System.out.println("100°C = " + tc.celsiusToFahrenheit(100) + "°F");
        System.out.println("212°F = " + tc.fahrenheitToCelsius(212) + "°C");
    }
}
