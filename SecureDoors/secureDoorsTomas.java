import java.util.ArrayList;
import java.util.Scanner;

public class secureDoorsTomas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ArrayList för att hålla koll på vilka som är i huset
		ArrayList<String> insideHouse = new ArrayList<String>();

		int logLength = sc.nextInt();
		for (int i = 0; i < logLength; i++) {
			String action = sc.next(); // Första är entry/exit
			String name = sc.next(); // Andra är vem som entered/exited

			// Om name går in i huset
			if (action.equals("entry")) {
				System.out.println(name + " entered");
				if (insideHouse.contains(name)) {
					System.out.print(" (ANOMALY)"); // Samma rad
				} else {
					insideHouse.add(name); // Lägg till i huset
				}
			}

			// Om name lämnar huset
			if (action.equals("exit")) {
				System.out.println(name + " exited");
				if (!insideHouse.contains(name)) {
					System.out.print(" (ANOMALY)");
				} else {
					insideHouse.remove(name); // Ta bort från huset
				}
			}
		}

	}

}
