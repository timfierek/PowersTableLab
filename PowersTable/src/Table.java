import java.util.Scanner;

/**
 * Table.java collects number(s) from the user and subsequently prints
 * multiplication table(s) and a squares and cubes table.
 * 
 * @author Tim Fierek
 *
 */
public class Table {

	/**
	 * contains major functionality and loop with method calls to continue
	 * taking in numbers from the user if desired.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		boolean loop = true;
		
		// Continue prompting input and printing tables until user enters 'n'
		while(loop) {
			getInput(in);			// Method call for input and output
			
			//Check if user wants to continue
			System.out.print("\nContinue? (y/n): ");
			if(in.next().equalsIgnoreCase("n")) {
				loop = false;
			}
		}
		
		in.close();
		return;
	}
	
	/**
	 * getInput prompts the user for input and also calls printTable and
	 * printMultTable for output.
	 * 
	 * @param in Scanner object to be used for gathering input
	 */
	public static void getInput(Scanner in) {
		int num = -1;
		System.out.print("\nEnter an integer: ");
		num = in.nextInt();
		printTable(num);
		printMultTable(num);
		
	}
	
	/**
	 * printTable takes in a number and prints a formatted table
	 * containing the squares and cubes of all numbers from 1 to num
	 * 
	 * @param num number to be used for printing the cubes and squares table
	 */
	public static void printTable(int num) {
		
		System.out.printf("%-10s", "Number");
		System.out.printf("%-11s", "Squared");
		System.out.printf("%-9s%n", "Cubed");
		System.out.printf("%-10s%-11s%-9s%n", "======", "=======", "=====");
		
		for(int i = 1; i <= num; i++) {
			System.out.printf("%-10d", i);
			System.out.printf("%-11d", (i*i));
			System.out.printf("%-9d%n", (i*i*i));
		}
	}
	
	/**
	 * printMultTable takes a num and prints a formatted multiplication table.
	 * 
	 * @param num number to be used for printing multiplication table.
	 */
	public static void printMultTable(int num) {
		
		//Print top row
		System.out.println("\n\nMultiplication Table:");
		System.out.print("    ");
		for(int i = 1; i <= num; i++) {
			System.out.printf("%-4d", i);
		}
		System.out.println();
		System.out.print("    ");
		for(int i = 1; i <= num; i++) {
			System.out.printf("%-4s", "=");
		}
		System.out.println();
		
		for(int i = 1; i <= num; i++) {
			
			System.out.printf("%-2d%-2s", i, "|");
			for(int j = 1; j <= num; j++) {
				System.out.printf("%-4d" , (j * i));
			}
			System.out.println();
		}
		
		
	}

}
