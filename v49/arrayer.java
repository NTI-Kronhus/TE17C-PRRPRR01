import java.util.Scanner;

public class arrayer {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Hur många tal vill du skriva in?");
	
	// Skapar en array med 12 heltal
	int[] olikaTal = {1, 5, 10, 47, 63, 2, -7, 7, 4, 9, 4, 6};
	
	// Skapar en array av storlek som bestäms av användaren från konsolen
	int[] olikaTal2 = new int[input.nextInt()];
	
	// Initierar en räknare som används senare
	int counter = 0;
	
	// Man kan skapa en array av decimaltal eller strängar också
	double[] decimalTal = {1.0, 2.2, 3.5};
	String[] namn = {"Tomas", "Ludvig", "Isak", "Dilan", "Ahmed"};

	// Informerar användaren om hur många heltal man ombeds skriva
	System.out.printf("Skriv %d heltal!\n", olikaTal2.length);

	// Låter användaren skriva in lika många heltal som antalet luckor i arrayen
	for (int i = 0; i < olikaTal2.length; i++) {
		
		olikaTal2[i] = input.nextInt();
	}

	// Skriver ut alla tal som matats in på en rad
	for (int i = olikaTal2.length - 1; i >= 0; i--) {
		
//		System.out.print(olikaTal2[i] + ", ");
	}

	// Kollar hur många gånger talet "4" förekommer i int arrayen
	for (int i = 0; i < olikaTal2.length; i++) {
		
		if (olikaTal2[i] == 4){
			
			counter++;
		}
	}
	
	// Skriver ut antal 4or i arrayen
	System.out.println(counter);
	
	input.close();
}
	
	
	
	
	
	
	
	
}
