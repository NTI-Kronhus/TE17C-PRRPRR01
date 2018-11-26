package Läxa_v46;

import java.util.Scanner;

public class stuckInATimeLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tal = sc.nextInt();

		for (int i = 1; i <= tal; i++) {
			System.out.println(i + " Abracadabra");
		}
	}
}
