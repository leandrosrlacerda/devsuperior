import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int y = 32;
        double x = 10.35784;

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        System.out.println("Inclusao desta linha de comando para testar github");
        System.out.println("Inclusao de mais uma linha de comando");


    }
}
