public class TemperatureConverter {
    private double celsius;
    private double fahrenheit;

    public void setCelsius(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = (celsius * 9 / 5) + 32;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        converter.setCelsius(25);
        System.out.println("Celsius: " + converter.getCelsius());
        System.out.println("Fahrenheit: " + converter.getFahrenheit());

        converter.setFahrenheit(77);
        System.out.println("Celsius: " + converter.getCelsius());
        System.out.println("Fahrenheit: " + converter.getFahrenheit());
    }
}