import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner scanner = new Scanner(System.in);
			
			String x;
			int y;
			double z;
			char a;
			
			x = scanner.next();
			System.out.println("Você digitou: " + x);
			
			y = scanner.nextInt();
			System.out.println("Você digitou: " + y);
			
			z = scanner.nextDouble();
			System.out.println("Você digitou: " + z);
			
			a = scanner.next().charAt(0);
			System.out.println("Você digitou: " + a);
			
			scanner.close();
		}
}
