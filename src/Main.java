import java.util.Scanner; // importing scanner class

public class Main {
    public static void main(String[] args) {

        // freezing & boiling points for celsius & fahrenheit, respectively:
        final int FREEZING_CELSIUS = 0;
        final int BOILING_CELSIUS = 100;
        final int FREEZING_FAHRENHEIT = 32;
        final int BOILING_FAHRENHEIT = 212;

        int celsiusTemp = 0; // for user input
        String trash = ""; // bad input

        int fahrenheitTemp; // stores user input converted to fahrenheit

        // initializing scanner
        Scanner in = new Scanner(System.in);

        // prompting user
        System.out.println("Enter a temperature in degrees Celsius to convert it to Fahrenheit.");

        // checking if input is an int
        if (in.hasNextInt()){
            celsiusTemp = in.nextInt(); // stores input
            in.nextLine(); // clearing \n from buffer
        } else {
            trash = in.nextLine(); // if not an int, throw it in the trash
            System.out.println("You entered: " + trash + "\n" +
                    "Invalid temperature.");
            System.exit(0); // terminate
        }

        // now we have the temperature, converting to fahrenheit:
        fahrenheitTemp = (celsiusTemp * 9 / 5) + 32;

        System.out.println(celsiusTemp + "° Celsius is equal to " + fahrenheitTemp + "° Fahrenheit.");

        // testing for freezing point:
        if (celsiusTemp <= FREEZING_CELSIUS) {
            System.out.println("Your temperature falls below the freezing point of " + FREEZING_CELSIUS +
                    "° Celsius, or " + FREEZING_FAHRENHEIT + "° Fahrenheit.");
        } else if (celsiusTemp >= BOILING_CELSIUS) { // if not, tests for boiling
            System.out.println("Your temperature is over the boiling point of " + BOILING_CELSIUS +
                    "° Celsius, or " + BOILING_FAHRENHEIT + "° Fahrenheit.");
        }

        //end

    }
}