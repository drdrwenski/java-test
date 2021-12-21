import java.util.Random;
import java.util.Scanner;

public class WoerterRaten {

	public static void main(String[] args) {
		Random random = new Random();
		
		String wort = "BICYCLE";
		char[] buchstaben = wort.toCharArray();

		int zufall;
		
		for(int i = 0; i < wort.length(); i++) {
			zufall = random.nextInt(wort.length());	
			char tmp = buchstaben[i];
			buchstaben[i] = buchstaben[zufall];
			buchstaben[zufall] = tmp;
		}
		
		System.out.println(new String(buchstaben));
		
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Dein Tipp:");
		String tipp = eingabe.next();
		
		int treffer = 0;

		for (int i=0; i<wort.length(); i++) {
			if (tipp.charAt(i) == wort.charAt(i)) {
				treffer++;
				System.out.print(tipp.charAt(i));
			} else {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.println("Treffer: " + treffer);
	}

}
