package masterMind2_0;

import java.util.Scanner;

public class KleurenCode  {
	public int score = 0;
	
	public String[] SecretCodeGenerator() {
		String[] secretCode = { "R", "O", "B", "G" };
		return secretCode;
	}
	
	
	
	public String[] UserInput() {
		Scanner scanner = new Scanner (System.in);
		String userCode[] = { scanner.next().toUpperCase(), scanner.next().toUpperCase(), scanner.next().toUpperCase(), scanner.next().toUpperCase() };
		return userCode;
	}
	
	public String[] resultaatChecker (String[] secretCode, String[] userCode) {

		             
		 String[] codeControleer = new String[4];
		
		
		for (int x = 0; x < userCode.length; x++) {
			codeControleer[x] = "- ";
			if (userCode[x].equals(secretCode[x])) {
			    codeControleer[x] = "B ";
			    score++;
			} else  {
				for (int b = 0; b < userCode.length; b++) { 
					if (userCode[x].equals(secretCode[b])) {
						codeControleer[x] = "W ";
						break;
					}
				}
			    
			} 
			System.out.print(codeControleer[x]);
		}	
		 return codeControleer;
	}

	
	public void zwartGewonnen () {
			System.out.println("\nYou have won, GG");
			return;
	}
	
	public void witVerloren () {
		System.out.println("\nYou have lost");
		return;
	}
		

	



}