import java.util.Locale;
import java.util.Scanner;

public class testScan {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Escreva seu nome:");
            String nome = scan.nextLine();

            System.out.println("Seu nome é " + nome + ", que nome bonito.");
        }
    }
}
