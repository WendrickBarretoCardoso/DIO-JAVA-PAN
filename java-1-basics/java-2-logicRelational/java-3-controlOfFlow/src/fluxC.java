public class fluxC {
    public static void main(String[] args) throws Exception {
        boolean t = true;
        boolean f = false;

        int x = 1;

        // If, else if, else

        if (t == f) {
            System.out.println("True");
        } else if (t != f){
            System.out.println("False");
        } else {
            System.out.println("Something is missing");
        }


        // Switch

        switch (x) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Something is missing");
                break;
        }
    }
}
