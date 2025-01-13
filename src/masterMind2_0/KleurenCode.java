package masterMind2_0;

import java.util.Scanner;

public class KleurenCode  {

	public String[] SecretCodeGenerator() {
		String[] secretCode = { "R", "O", "B", "G" };
		return secretCode;
	}
	
	
	
	public String[] UserInput() {
		Scanner scanner = new Scanner (System.in);
		String userCode[] = { scanner.next().toUpperCase(), scanner.next().toUpperCase(), scanner.next().toUpperCase(), scanner.next().toUpperCase() };
		return userCode;
	}

}