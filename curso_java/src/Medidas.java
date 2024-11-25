import java.util.Locale;
import java.util.Scanner;

public class Medidas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		double A, B, C;
		
		System.out.print("Digite a medida A: ");
		A = scanner.nextDouble();
		System.out.print("Digite a medida B: ");
		B = scanner.nextDouble();
		System.out.print("Digite a medida C: ");
		C = scanner.nextDouble();
		
		System.out.printf("AREA DO QUADRADO: %.4f%n", (Math.pow(A, 2)));
		System.out.printf("AREA DO TRIANGULO: %.4f%n", ((A*B)/2));
		System.out.printf("AREA DO TRAPEZIO: %.4f%n", (A+B)*C/2);
		
		scanner.close();
	}
}
