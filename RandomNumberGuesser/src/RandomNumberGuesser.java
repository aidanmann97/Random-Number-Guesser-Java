import java.util.*;

public class RandomNumberGuesser {

	public static void main(String[] args) {
		Random rand = new Random();
		int randNum = rand.nextInt((99)  + 1)+ 1; 								//generates random number 1-100
		int tries = 0; 															//records number of tries
		Scanner input = new Scanner(System.in);
		int guess;																//user guess
		boolean win = false;
		
		try {																	//input validation
			System.out.println("I am thinking of a number between 1 and 100");
			
				while (win==false) {
					System.out.println("Guess the number");
					guess = input.nextInt();
					tries++;
			
					if (guess == randNum) { 
						win = true;
					} else if (guess > randNum) {
						System.out.println("Your guess was too high");
					} else if (guess < randNum) {
						System.out.println("Your guess was too low");
					}
				}
				System.out.println("Congratulations! You guessed correctly! You win!");
				System.out.println("The random number was: " + randNum);
				System.out.println("It took you " + tries + " tries to guess the correct number.");
		} catch (Exception e) {
				System.out.println("Please guess an integer!");

		}

	}

}
