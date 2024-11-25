import java.util.Locale;
import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double base;
		double altura;
		
		base = scanner.nextDouble();
		altura = scanner.nextDouble();
		
		System.out.printf("AERA = %.4f%n", (base * altura));
		System.out.printf("PERIMETRO = %.4f%n", (2 * (base + altura)));
		System.out.printf("DIAGONAL = %.4f%n", Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2)));
		
		scanner.close();
	}
	
}
