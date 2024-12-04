import java.util.Locale;
import java.util.Scanner;

public class Dardo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double distanciaA, distanciaB, distanciaC, maiorDistancia;
		
		System.out.println("Digite as tres distancias: ");
		
		distanciaA = scanner.nextDouble();
		distanciaB = scanner.nextDouble();
		distanciaC = scanner.nextDouble();
		
		if (distanciaA > distanciaB && distanciaA > distanciaC) {
			System.out.printf("MAIOR DISTANCIA = %.2f%n", distanciaA);
		}
		else if(distanciaB > distanciaC) {
			System.out.printf("MAIOR DISTANCIA = %.2f%n", distanciaB);	
		}
		else {
			System.out.printf("MAIOR DISTANCIA = %.2f%n", distanciaC);
		}
		
		scanner.close();
	}
}
