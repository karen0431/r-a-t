import java.util.Scanner;

public class randomInput {

	public static void main(String[] args) {
		Scanner userInputScanner = new Scanner(System.in);
		System.out.println("Please choose a letter from these options: r, a, t");
		String letter = userInputScanner.next();


		while (!letter.equals("r") && !letter.equals("a") && !letter.equals("t")) {
			System.out.println("Please choose a letter from these options: r, a, t");
			letter = userInputScanner.next();

			if (letter.equals("r") || letter.equals("a") || letter.equals("t")) {
				System.out.println("The letter you chose is " + letter);
			}
			else 
				System.out.println("Please try again");
			
		}
	}
}