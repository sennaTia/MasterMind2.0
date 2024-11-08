package masterMind2_0;

import java.util.Scanner;

public class MasterMind2_0 {

	public static void main(String[] args) {
		String[] secretCode = { "R", "B", "G", "O" };

		int i = 0;
		int guesses = 0;
		int score = 0;

		    Scanner scanner= new Scanner(System.in);
			String[] colors = { "R ", "G ", "B ", "Y ", "P ", "O ", };

			while (guesses < 10) {
				i++;
				System.out.println("Guess: " + (i) + "/10\n" + "Please choose 4 out of any of the 6 Colors: "
						+ colors[0] + colors[1] + colors[2] + colors[3] + colors[4] + colors[5]);
				String userCode[] = { scanner.next(), scanner.next(), scanner.next(), scanner.next() };

				if (userCode[0].equals(secretCode[0])) {
					System.out.print("B ");
					score++;
				} else if (userCode[0].equals(secretCode[1])) {
					System.out.print("W ");
				} else if (userCode[0].equals(secretCode[2])) {
					System.out.print("W ");
				} else if (userCode[0].equals(secretCode[3])) {
					System.out.print("W ");
				} else {
					System.out.print("- ");
				}

				if (userCode[1].equals(secretCode[1])) {
					System.out.print("B ");
					score++;
				} else if (userCode[1].equals(secretCode[0])) {
					System.out.print("W ");
				} else if (userCode[1].equals(secretCode[2])) {
					System.out.print("W ");
				} else if (userCode[1].equals(secretCode[3])) {
					System.out.print("W ");
				} else {
					System.out.print("- ");
				}
				
				if (userCode[2].equals(secretCode[2])) {
					System.out.print("B ");
					score++;
				} else if (userCode[2].equals(secretCode[1])) {
					System.out.print("W ");
				} else if (userCode[2].equals(secretCode[0])) {
					System.out.print("W ");
				} else if (userCode[2].equals(secretCode[3])) {
					System.out.print("W ");
				} else {
					System.out.print("- ");
				}

				if (userCode[3].equals(secretCode[3])) {
					System.out.print("B ");
					score++;
				} else if (userCode[3].equals(secretCode[1])) {
					System.out.print("W ");
				} else if (userCode[3].equals(secretCode[2])) {
					System.out.print("W ");
				} else if (userCode[3].equals(secretCode[0])) {
					System.out.print("W ");
				} else {
					System.out.print("- ");
				}

				guesses++;

				
				
				if (score == 4) {
					guesses = 11;
					break;
				}
				score = 0;

			}
			if (score == 4) {
				System.out.println("\nYou have won, GG");
			} else {
				System.out.println("\nYou have lost");
			}
			scanner.close();
		 
	}
}

	