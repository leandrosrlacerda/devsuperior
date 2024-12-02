import java.util.Locale;
import java.util.Scanner;

public class Operadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int minutos;
		
		minutos = scanner.nextInt();
		
		if (minutos <= 100) {
			System.out.println("Valor a pagar: R$ 50.00");
		} else {
			System.out.println("Valor a pagar: R$ " +(((minutos - 100) * 2) + 50));  
		}
		
		scanner.close();
	}
}
