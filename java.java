import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose the input temperature scale (C/F/K): ");
        String inputScale = scanner.next().toUpperCase();

        System.out.println("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        switch (inputScale) {
            case "C":
                System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(temperature));
                System.out.println("Celsius to Kelvin: " + celsiusToKelvin(temperature));
                break;
            case "F":
                System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(temperature));
                System.out.println("Fahrenheit to Kelvin: " + fahrenheitToKelvin(temperature));
                break;
            case "K":
                System.out.println("Kelvin to Celsius: " + kelvinToCelsius(temperature));
                System.out.println("Kelvin to Fahrenheit: " + kelvinToFahrenheit(temperature));
                break;
            default:
                System.out.println("Invalid scale entered. Please enter C, F, or K.");
                break;
        }

        scanner.close();
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
}