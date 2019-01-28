import java.util.Arrays;

public class kasta_tarning {

	public static void main(String[] args) {

		int ANTAL_KAST = 10000000;
		int ANTAL_UTFALL = 2;
		
		int[] resultat = new int[ANTAL_UTFALL];

		for (int i = 0; i < ANTAL_KAST; i++) {
			int random = (int) (Math.random() * ANTAL_UTFALL);
			resultat[random]++;
		}

		for (int i = 0; i < resultat.length; i++) {
			System.out.println("Antal " + (i + 1) + ":or " + resultat[i]);
		}

	}

}
