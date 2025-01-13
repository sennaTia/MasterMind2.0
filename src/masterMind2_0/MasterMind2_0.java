package masterMind2_0;



public class MasterMind2_0 {

	public static void main(String[] args) {

		
//		Dit zijn de 3 variabele die ik gebruik voor mijn code.
		int i = 0;
		int guesses = 0;
		int score = 0;

		
		
		
		KleurenCode randomizercode = new KleurenCode();
		
		

		while (guesses < 10) {
			i++;
			System.out.println("Guess: " + (i) + "/10\n" + "Please choose 4 out of any of the 6 Colors: R, G, B, Y, P, O");
			String[] secretCode = randomizercode.SecretCodeGenerator();
			String userCode[] = randomizercode.UserInput();


			
			String resultaat;             
			
			for (int x = 0; x < userCode.length; x++) {
				resultaat = "- ";
				if (userCode[x].equals(secretCode[x])) {
				    resultaat = "B ";
				    score++;
				} else  {
					for (int b = 0; b < userCode.length; b++) { 
						if (userCode[x].equals(secretCode[b])) {
							resultaat = "W ";
							break;
						}
					}
				    
				} System.out.print(resultaat);
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
		

	}
}
