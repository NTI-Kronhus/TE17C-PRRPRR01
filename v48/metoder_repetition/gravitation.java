package metoder_repetition;

public class gravitation {
	
	static double force;
	
	public static void main(String[] args) {
		
		// deklarerar variabler
		double massaPerson = 80;
		double massaJorden = 5.972 * Math.pow(10, 24);
		double radieJorden = 6378000;
		double gravitationsKonstant = 6.67408 * Math.pow(10, -11);
		double gravitationsAcc;
		
		System.out.printf("The force is = %.2f N", gravitationsKraft(massaJorden, massaPerson, radieJorden, 
				 gravitationsKonstant));
		
		// anropar metoden "gravitationsKraft" och räknar ut gravitationsaccelerationen
		gravitationsAcc = gravitationsKraft(massaJorden, massaPerson, radieJorden, 
				 gravitationsKonstant) / massaPerson;
		
		System.out.printf("\nJordens gravitationsacceleration är: %.2f m/s^2", gravitationsAcc);
		
	}

	// Metoden räknar ut gravitationskraft och returnerar denna
	static double gravitationsKraft(double massaJorden, double massaPerson, double radieJorden,
			double gravitationsKonstant) {
		
		force = massaPerson * massaJorden * gravitationsKonstant/(Math.pow(radieJorden, 2));
		
		return force;
		
	}

	
}
