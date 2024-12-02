package masterMind2_0;

import java.util.Scanner;

public class MasterMind2_0 {

	public static void main(String[] args) {

		int i = 0;
		int guesses = 0;
		int score = 0;

		
		
		Scanner scanner = new Scanner(System.in);
		

		while (guesses < 10) {
			i++;
			System.out.println("Guess: " + (i) + "/10\n" + "Please choose 4 out of any of the 6 Colors: R, G, B, Y, P, O");
			String[] secretCode = { "P", "O", "Y", "G" };
			String userCode[] = { scanner.next(), scanner.next(), scanner.next(), scanner.next() };

			
			int x = 0;
			
			if (userCode[x].equals(secretCode[x])) {
				System.out.print("B ");
				score++;
			} else if (userCode[x].equals(secretCode[1])) {
				System.out.print("W ");
			} else if (userCode[x].equals(secretCode[2])) {
				System.out.print("W ");
			} else if (userCode[x].equals(secretCode[3])) {
				System.out.print("W ");
			} else {
				System.out.print("- ");
			}

			++x;
			if (userCode[x].equals(secretCode[x])) {
				System.out.print("B ");
				score++;
			} else if (userCode[x].equals(secretCode[0])) {
				System.out.print("W ");
			} else if (userCode[x].equals(secretCode[2])) {
				System.out.print("W ");
			} else if (userCode[x].equals(secretCode[3])) {
				System.out.print("W ");
			} else {
				System.out.print("- ");
			}

			++x;
			if (userCode[x].equals(secretCode[x])) {
				System.out.print("B ");
				score++;
			} else if (userCode[x].equals(secretCode[1])) {
				System.out.print("W ");
			} else if (userCode[x].equals(secretCode[0])) {
				System.out.print("W ");
			} else if (userCode[x].equals(secretCode[3])) {
				System.out.print("W ");
			} else {
				System.out.print("- ");
			}

			++x;
			if (userCode[x].equals(secretCode[x])) {
				System.out.print("B ");
				score++;
			} else if (userCode[x].equals(secretCode[1])) {
				System.out.print("W ");
			} else if (userCode[x].equals(secretCode[2])) {
				System.out.print("W ");
			} else if (userCode[x].equals(secretCode[0])) {
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
