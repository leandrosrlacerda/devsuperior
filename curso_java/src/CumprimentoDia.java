import java.util.Scanner;

public class CumprimentoDia {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int hora;
		
		System.out.print("Digite as horas: ");
		hora = scanner.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia");
		}
		else if (hora >= 12 && hora <= 18) {
			System.out.println("Boa tarde");
		} 
		else {
			System.out.println("Boa noite");
		}
		
		scanner.close();
	}
}
