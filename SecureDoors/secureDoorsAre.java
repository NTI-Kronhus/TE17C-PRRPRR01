import java.util.ArrayList;
import java.util.Scanner;

public class secureDoorsAre {
	
	public static Scanner input = new Scanner(System.in);
	public static ArrayList<String> currentNameList = new ArrayList<String>();
	public static ArrayList<String> actionLog = new ArrayList<String>();

	public static void main(String[] args) {
		
		int numberOfActions = startSetup();
		
		documentActions(numberOfActions);
		
		printActionLog();	
	}
	
	/**
	 * Asks the user for the amount of actions to be made, and explains how to use the program to the user.
	 * 
	 * @return The amount of actions to be made during the course of the program.
	 */
	public static int startSetup() {
		System.out.println("\nValkommen till Securedoors(TM)! \n\nSkriv in antalet handelser, endast heltal accepteras.\n");
		
		int numberOfActions = input.nextInt();
		
		System.out.println("\nTack. Skriv nu in alla handelser vid dorren. En handelse at gangen, antingen: \n-entry NAMN- \neller \n-exit NAMN-");
		input.nextLine(); //buffer
		
		return numberOfActions;
	}
	
	/**
	 * Records the entries and exits through the doors.
	 * 
	 * @param amountOfActions The amount of actions to record.
	 */
	public static void documentActions(int amountOfActions) {
		for (int i = 1; i <= amountOfActions; i++) {
			String currentAction = input.nextLine();
			
			if(currentAction.startsWith("entry ")) {
				String currentName = currentAction.substring(6);
				entry(currentName);
			} else if(currentAction.startsWith("exit ")) {
				String currentName = currentAction.substring(5);
				exit(currentName);
			} else {
				i--;
				System.out.println("Felaktig input. Vanligen skriv in en handelse at gangen, antingen: \\n-entry NAMN- \\neller \\n-exit NAMN-");
			}
		}
	}
	
	/**
	 * Performs necessary actions and logs an entry.
	 * 
	 * @param name The name of the person who enters the building.
	 */
	public static void entry(String name) {
		String logItem = name + " entered";
		
		if(currentNameList.contains(name)) {
			logItem = logItem + " (ANOMALY)";
		} 
		else {
			currentNameList.add(name);
		}
		
		actionLog.add(logItem);
	}


	/**
	 * Performs necessary actions and logs an exit.
	 * 
	 * @param name The name of the person who exits the building.
	 */
	public static void exit(String name) {
		String logItem = name + " exited";
		
		if(!currentNameList.contains(name)) {
			logItem = logItem + " (ANOMALY)";
		} 
		else {
			currentNameList.remove(name);
		}
		
		actionLog.add(logItem);
	}
	
	/**
	 * Prints the log of the total amount of actions. 
	 * 
	 */
	public static void printActionLog() {
		for(String logItem : actionLog) {
			System.out.println(logItem);
		}
	}
}