import java.util.*;

public class GuessingGame {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner console = new Scanner(System.in);
		System.out.println("Try to guess an even one-digit number.");
		int answer = rand.nextInt(4) * 2;
		int guess = 1;
		while (answer != guess) {
			System.out.print("Your guess? ");
			guess = console.nextInt();
			if (guess == answer) {
				System.out.println("You got it right!");
			} else {
				System.out.println("Try again!");
			}
		}
		console.close();
	}
}
