package masterMind2_0;



public class MasterMind2_0 {

	public static void main(String[] args) {

		
//		Dit zijn de 3 variabele die ik gebruik voor mijn code.
		int i = 0;
		int guesses = 0;
		

		
		
//		Deze tekst hieronder wijst naar mijn andere bestandje
		KleurenCode randomizercode = new KleurenCode();
		
		

		while (guesses < 10) {
			i++;
			System.out.println("Guess: " + (i) + "/10\n" + "Please choose 4 out of any of the 6 Colors: R, G, B, Y, P, O");
			String[] secretCode = randomizercode.SecretCodeGenerator();
			String[] userCode = randomizercode.UserInput();


			String[] codeControleer = randomizercode.resultaatChecker(secretCode, userCode);



			guesses++;

			if (randomizercode.score == 4) {
				guesses = 11;
				break;
			}
			randomizercode.score = 0;

		}
		if (randomizercode.score == 4) {
			randomizercode.zwartGewonnen();
		} else {
			randomizercode.witVerloren();	
		}
		

	}
}
