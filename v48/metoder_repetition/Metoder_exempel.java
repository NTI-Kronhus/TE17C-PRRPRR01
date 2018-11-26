package metoder_repetition;

public class Metoder_exempel {

	public static void main(String[] args) {
		
		// Konstanter, dvs ändrar aldrig värden!
		final double MASS_EARTH = 5.972 * Math.pow(10, 24);
		final double GRAVITY_CONSTANT = 6.67408 * Math.pow(10, -11);
		final double RADIUS_EARTH = 6378000;

		// Variabler
		double tempCelsius = 32;
		double tempFahrenheit = 100;
		double massPerson = 82;

		System.out.println(victorSays("Victor"));
		
		System.out.println(celsiusToFahrenheit(tempCelsius) + " °F");

		// Skriver ut och formaterar grader Celsius
		System.out.printf("%.2f °C\n", fahrenheitToCelsius(tempFahrenheit));

		System.out.printf("Fg = %.2f N \n", gravityForce(MASS_EARTH, massPerson,
				GRAVITY_CONSTANT, RADIUS_EARTH));

		System.out.printf("Gravity acceleration = %.2f m/s^2 \n",
				gravityForce(MASS_EARTH, massPerson, GRAVITY_CONSTANT, RADIUS_EARTH) / massPerson);
	}

	// Metod som hälsar på personen
	static String victorSays(String name) {
		return ("Hej " + name);
	}

	// Metod som omvandlar Celsius till Fahrenheit
	static double celsiusToFahrenheit(double tempCelsius) {

		return (1.8 * tempCelsius + 32);

	}

	// Metod som omvandlar Fahrenheit till Celsius
	static double fahrenheitToCelsius(double tempFahrenheit) {

		return (tempFahrenheit - 32) / 1.8;
	}

	// Metod som räknar ut gravitationskraften på jorden
	static double gravityForce(double MASS_EARTH, double massPerson,
			double GRAVITY_CONSTANT, double RADIUS_EARTH) {

		return ((MASS_EARTH * massPerson * GRAVITY_CONSTANT) / (Math.pow(RADIUS_EARTH, 2)));
	}
	

}
