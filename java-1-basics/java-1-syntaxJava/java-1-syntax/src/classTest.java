public class classTest {
    public static void main(String[] arg) {
        int ano = 2021;
        final int apocalypse = 2050;  /// Final = Código Inalteravel
    
        boolean truth = true;
        boolean fake = false;
    
        ano = apocalypse;
            
        if (truth == fake) {
            fake = true;
            ano += ano;
        } else {
            truth = false;
        }
    
        System.out.print("Hello World!! \n");
    
        String firstName = "Wendrick";
        String secondName = "Barreto Cardoso";
    
        System.out.print("My full name is: " + fullName(firstName, secondName));
    }
    public static String fullName (String firstName, String secondName) {
        return firstName.concat(" ".concat(secondName));
    }    
}
