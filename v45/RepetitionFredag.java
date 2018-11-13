import java.util.Scanner;

public class RepetitionFredag {

	public static void main(String[] args) {

		// initierar variabler
		int tal1 = 0;
		int summa = 0;
		double average = 0;

		Scanner input = new Scanner(System.in);

		// skriver ut ett meddelande
		System.out.print("Please type 10 numbers: ");

		// summerar 10 tal som matats in från konsolen
		for (int i = 1; i <= 10; i++) {
			
			tal1 = input.nextInt(); // läser in ett heltal från konsolen

			// villkor som testar om talet är negativt och utför utefter det
			if (tal1 < 0) {
				System.out.println("Your number in negative. Please type again! ");
				i--;
			}

			// SKRIV IN ETT VILLKOR SÅ ATT TAL > 20 INTE SKA SKRIVAS UT
			if (tal1 > 20) {
				System.out.println("Your number is too big. Please type a number "
						+ "smaller than or equal to 20! ");
				i--;
			}

			// om talet är positivt så utför detta istället
			else {
				summa += tal1;
			}
		}

		
		// while-loopen nedan gör samma som for-loopen ovan
		int antalLoopar = 1;

		while (antalLoopar <= 10) {
			// tal1 += input.nextInt(); (för att slippa upprepa inmatning)
			antalLoopar++;
		}

		average = (double) summa / 10; // (double) gör om int till double
		average = summa / 10.0; 

		System.out.println(summa);
		System.out.println(average);

	}
}
