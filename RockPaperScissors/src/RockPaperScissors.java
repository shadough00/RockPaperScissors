
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		//Create Scanner for user input
		Scanner keyboard = new Scanner(System.in);


		//Ask user for how many points to win and store data
		System.out.print("Points to win:\t");
		String points_to_win = keyboard.next();
		int points_to_win1 = Integer.parseInt(points_to_win);

		//declare variables
		int current_wins = 0;
		int current_losses = 0;
		String result = "lose";
		String answer;
		String answer1;

	
		//create while loop for rock paper scissor and end the loop when one person reaches points to win
		while (current_wins < points_to_win1 && current_losses < points_to_win1){

		
			//ask user for input
			System.out.print("Rock, paper, or scissors?\t");
			answer = keyboard.next();
			answer1 = answer.toLowerCase();

			//make sure they enter correct string
			if (answer1.equals("rock") || answer1.equals("scissors") || answer1.equals("paper")) {
				;
			} else {
				System.out.println("Invalid Input......System Exiting");
				System.exit(0);
			}

/*
			//computer choice
			String computerMove = ComputerOpponent.getMove(); 


			//figures out if answer is win or lose:
			if (answer1.equalsIgnoreCase("rock")) {
				if (computerMove.equalsIgnoreCase("paper")) {
					result = ", so you lose.";
				} else if (computerMove.equalsIgnoreCase("scissors")) {
					result = ", so you win!";
				} else  {
					result = ", so it's a tie.";
				}
			} else if (answer1.equalsIgnoreCase("paper")) {
				if (computerMove.equalsIgnoreCase("rock")) {
					result = ", so you win!";
				} else if (computerMove.equalsIgnoreCase("scissors")) {
					result = ", so you lose.";
				} else {
					result = ", so it's a tie.";
				}
			} else if (answer1.equalsIgnoreCase("scissors")) {
				if (computerMove.equalsIgnoreCase("rock")) {
					result = ", so you lose.";
				} else if (computerMove.equalsIgnoreCase("paper")) {
					result = ", so you win!";
				} else {
					result = ", so it's a tie.";
				}
			}

			if (result.equals(", so you lose.")) {
				current_losses = current_losses + 1;
			} else if (result.equals(", so you win!")) {
				current_wins = current_wins + 1;
			} else {
				;
			}
			//print result of move
			System.out.println("The computer chose " + computerMove + " " + result + "\t(" + current_wins + '-' + current_losses + ')');
		} 
		

		//print final results
		if (current_wins > current_losses) {
			System.out.println("Congratulations! You won!");
		} else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}



*/

		
		}
	}
}


