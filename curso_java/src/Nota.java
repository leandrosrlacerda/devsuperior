import java.util.Locale;
import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double nota1, nota2;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = scanner.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = scanner.nextDouble();
		
		System.out.printf("NOTA FINAL = %.1f%n", (nota1 + nota2));
		
		if (nota1 + nota2 < 60) {
			System.out.println("REPROVADO");
		}
		
		scanner.close();
	}
}
