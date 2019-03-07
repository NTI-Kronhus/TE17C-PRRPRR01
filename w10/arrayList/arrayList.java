package arrayList;

import java.util.ArrayList; // måste finnas med om ArrayList ska användas

public class arrayList {

	public static void main(String[] args) {

		// Skapa en Array list (tänk på likheten med Scanner)
		ArrayList<String> nameList = new ArrayList<>();

		nameList.add("Olle"); // På index 0
		nameList.add("Lisa"); // På index 1
		nameList.add("Lasse"); // På index 2

		// skriver ut en ArrayList innehållet mha .size() och .get()
		for (int i = 0; i < nameList.size(); i++) {
			System.out.print(nameList.get(i) + " ");
		}
		
		System.out.println();

		nameList.add(1, "Anna"); // lägger till "Anna" på index 1 och skjuter allt ett steg åt höger
		System.out.println(nameList);  // skriver ut nameList på ett speciellt sätt med hakparenteser

		nameList.set(2, "Britta"); // byter ut namnet på index 2 mot "Britta"
		System.out.println(nameList);

		nameList.remove(0); // tar bort namnet på index 0 och skjuter allt ett steg til vänster
		System.out.println(nameList);

		nameList.remove("Britta"); // tar bort första elementet som == "Britta" förekommer i ArrayList
		System.out.println(nameList);

		// Till skillnad från arrayer kan man inte lagra primitiva typer (int, double, ...) i dessa listor.
		// Om man vill lagra t ex heltal i lista så får man använda sig av omslagsklassen Integer.
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		for (int i = 0; i < 100; i++) {
			alist.add(new Integer(i * i));
		}
		for (int i = 0; i < alist.size(); i++) {
			System.out.println((alist.get(i)).intValue()); // gör om Integer till en int i syfte att utföra
														   // aritmetiska operationer och skriver ut dem
		}
	}

}
