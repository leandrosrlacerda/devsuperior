import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double precoUnitario, dinheiro, troco, faltam;
		int quantidade;
		
		System.out.print("Preço unitário do produto: ");
		precoUnitario = scanner.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		quantidade = scanner.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		dinheiro = scanner.nextDouble();
		
		if (precoUnitario * quantidade > dinheiro) {
			faltam = precoUnitario * quantidade - dinheiro;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", faltam);
		}
		else {
			troco = dinheiro - (precoUnitario * quantidade);
			System.out.printf("TROCO = %.2f%n", troco);
		}
		
		scanner.close();
	}
	
}
