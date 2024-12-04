import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		char unidadeDeMedida;
		double celcius, fahrenheit;
		
		System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
		unidadeDeMedida = scanner.next().charAt(0);
		
		if (unidadeDeMedida == 'F') {
			System.out.println("Digite a temperatura em Fahrenheit: ");
			fahrenheit = scanner.nextDouble();
			
			celcius = 5.0 / 9.0 * (fahrenheit - 32.0);
			
			System.out.printf("Temperatura equivalente em Celsius: %.2f\n", celcius);	
		}
		else {
			System.err.print("Digite a temperatura em Celsius: ");
			celcius = scanner.nextDouble();
			
			fahrenheit = celcius * 9.0 / 5.0 + 32.0;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", fahrenheit);
			
		}
		
		scanner.close();
	}
}
