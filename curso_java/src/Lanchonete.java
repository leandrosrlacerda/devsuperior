import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		/* 
		double a = 5.00, 
			   b = 3.50,
			   c = 4.80,
			   d = 8.90,
			   e = 7.32;
		
		char codigo;
		int quantidade;
		
		System.out.print("Entre com a quantidade do produto: ");
		quantidade = scanner.nextInt();
		System.out.println("Entre com o código do produto: ");
		codigo = scanner.next().charAt(0);
		
		if (codigo == 'a') {
			System.out.printf("Valor a pagar: %.2f\n", a * quantidade);
		} 
		else if (codigo == 'b') {
			System.out.printf("Valor a pagar: %.2f\n", b * quantidade);
		}
		else if (codigo == 'c') {
			System.out.printf("Valor a pagar: %.2f\n", c * quantidade);
		} 
		else if (codigo == 'd') {
			System.out.printf("Valor a pagar: %.2f\n", d * quantidade);
		}
		else
		{
			System.out.printf("Valor a pagar: %.2f\n", e * quantidade);
		}
		*/ 
		
		int codigo, quantidade;
		double pagar;
		
		System.out.print("Entre com a quantidade do produto: ");
		quantidade = scanner.nextInt();
		System.out.println("Entre com o código do produto: ");
		codigo = scanner.nextInt();
		
		pagar = 0;
		
		if (codido == 1) {
			pagar = quantidade * 5.00;
		}
		
		scanner.close();
	}
	
}
