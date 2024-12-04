import java.util.Locale;
import java.util.Scanner;

public class Glicose {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double quantidadeGliscoseSangue;

		System.out.print("Entre com a quantidade de glicose no sangue: ");
		quantidadeGliscoseSangue = scanner.nextDouble();

		if (quantidadeGliscoseSangue <= 100) {
			System.out.printf("Classificação: %.1f - Normal%n", quantidadeGliscoseSangue);
		} 
		else if (quantidadeGliscoseSangue <= 140) {
			System.out.printf("Classificação: %.1f - Elevado%n", quantidadeGliscoseSangue);
		} 
		else {
			System.out.printf("Classificação: %.1f - Diabetes%n", quantidadeGliscoseSangue);
		}

		scanner.close();
	}
}
