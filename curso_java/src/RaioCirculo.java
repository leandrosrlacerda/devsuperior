import java.util.Locale;
import java.util.Scanner;

public class RaioCirculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double raio;
		
		raio = scanner.nextDouble();
		
		System.out.printf("AREA = %.3f%n", (3.14159 * (Math.pow(raio, 2))));
		
		scanner.close();
	}
}
