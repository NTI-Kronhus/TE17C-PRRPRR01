package Läxa_v46;

public class Uppgift4 {

	public static void main(String[] args) {

		int summa = 0;
		for (int i = 1; i < 10000; i++) {
			if (i % 7 == 0) {
				summa = summa + i;
			}
		}

		System.out.println("Summa: " + summa);

	}

}