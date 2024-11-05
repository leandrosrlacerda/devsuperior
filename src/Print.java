import java.util.Locale;

public class Print {

    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 40;
        int code = 5290;
        char gender = 'M';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("\nProducts:\nComputer, which price is $ " + price1 + "\nOffice desk, which price is $ " + price2 +
                "\n\nRecord: "  + age + " years old, code " + code + " and gender: " + gender + "\n\nMeasure with eight decimal places: "
                + measure);
        System.out.printf("Rouded (three decimal places): %.3f", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("\nUS decimal point: %.3f", measure);
    }
}
