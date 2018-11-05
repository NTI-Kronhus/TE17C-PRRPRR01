package genomgång;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];
		int sum = 0;

		System.out.println("Type in 10 integers:");
		
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < numbers.length; i++) {
			
			sum += numbers[i];
		}
		
		System.out.println(sum);
		
	}

}
