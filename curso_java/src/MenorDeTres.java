import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		if (a < b && a < c) {
			System.out.println("O menor valor é a = " + a);
		} else if (b < c) {
			System.out.println("O menor valor é b = " + b);
		} else {
			System.out.println("O menor valor é c = " + c);
		}
		
		
		
		scanner.close();
	}

}
