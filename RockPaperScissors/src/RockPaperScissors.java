
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

	public static void main(String[] args) {

		//Create Scanner for user input
		Scanner keyboard = new Scanner(System.in);

		//random number generator
		Random rand = new Random();

		System.out.println("***Rock Paper Scissors Game***");

		//Ask user for how many points to win and store data
		System.out.print("Enter the number of points to win:\t");
		int points_to_win = keyboard.nextInt();

		//declare variables
		int current_wins = 0;
		int current_losses = 0;
		String result = "lose";
		String answer;
		String answer1;
		String computer_move = "nothing";


		//create while loop for rock paper scissor and end the loop when one person reaches points to win
		while (current_wins < points_to_win && current_losses < points_to_win){

			//getting a random computer response
			int num = rand.nextInt(3);
			if (num == 0) {
				computer_move = "rock";
			} else if (num == 1) {
				computer_move = "paper";
			} else {
				computer_move = "scissors";
			}

			//ask user for input
			System.out.print("Rock, paper, or scissors?\t");
			answer = keyboard.next();
			answer1 = answer.toLowerCase();

			//make sure they enter a valid answer
			if (answer1.equals("rock") || answer1.equals("scissors") || answer1.equals("paper")) {
				;
			} else {
				System.out.println("Invalid Input......System Exiting");
				System.exit(0);
			}

			//figures out if answer is win or lose:
			if (answer1.equalsIgnoreCase("rock")) {
				if (computer_move.equalsIgnoreCase("paper")) {
					result = ", so you lose.";
				} else if (computer_move.equalsIgnoreCase("scissors")) {
					result = ", so you win!";
				} else  {
					result = ", so it's a tie.";
				}
			} else if (answer1.equalsIgnoreCase("paper")) {
				if (computer_move.equalsIgnoreCase("rock")) {
					result = ", so you win!";
				} else if (computer_move.equalsIgnoreCase("scissors")) {
					result = ", so you lose.";
				} else {
					result = ", so it's a tie.";
				}
			} else if (answer1.equalsIgnoreCase("scissors")) {
				if (computer_move.equalsIgnoreCase("rock")) {
					result = ", so you lose.";
				} else if (computer_move.equalsIgnoreCase("paper")) {
					result = ", so you win!";
				} else {
					result = ", so it's a tie.";
				}
			}

			//Gives one point to the winner of the match
			if (result.equals(", so you lose.")) {
				current_losses = current_losses + 1;
			} else if (result.equals(", so you win!")) {
				current_wins = current_wins + 1;
			} else {
				;
			}
			//print result of move
			System.out.println("The computer chose " + computer_move + " " + result + "\t(" + current_wins + '-' + current_losses + ')');
		} 

		//print final results
		if (current_wins > current_losses) {
			System.out.println("Congratulations! You won!");
		} else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}

	}
}



