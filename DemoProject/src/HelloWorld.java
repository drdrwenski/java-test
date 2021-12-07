import java.util.Random;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("How are you!");
		
		Random rnd = new Random();
		int zufallszahl = rnd.nextInt(100);
		System.out.println(zufallszahl);
	}

}
