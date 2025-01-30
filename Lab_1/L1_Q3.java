class TemperatureConverter {
    private double celsius;
    private double fahrenheit;

   
    public double getCelsius() {
        return this.celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = celsius * 9 / 5 + 32; 
    }

    public double getFahrenheit() {
        return this.fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        this.celsius = (fahrenheit - 32) * 5 / 9; 
    }
}


public class L1_Q3{
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        converter.setCelsius(32);
        System.out.println("Celsius: " + converter.getCelsius());
        System.out.println("Fahrenheit: " + converter.getFahrenheit());
        }
}