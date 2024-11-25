import java.util.Locale;
import java.util.Scanner;

public class MedidaTerreno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double largura;
		double comprimento;
		double valorMetroQuadrado;
		double areaDoTerreno;
		
		largura = scanner.nextDouble();
		comprimento = scanner.nextDouble();
		valorMetroQuadrado = scanner.nextDouble();
		
		areaDoTerreno = largura * comprimento;
		
		System.out.printf("Área do terreno = %.2f%n", areaDoTerreno);
		System.out.printf("Preço do terreno = %.2f%n", (valorMetroQuadrado * areaDoTerreno));
		
		
		scanner.close();
	}
}
