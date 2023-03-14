public class logic {
    public static void main(String[] args) throws Exception {
        int x1 = 1;
        int x2 = 2;

        // &&  =  and
        System.out.println(x1 == 1 && x2 == 2);
        System.out.println(x1 == 1 && x2 == 1);
        System.out.println(x1 == 2 && x2 == 1);

        System.out.println();
        // ||  =  ou
        System.out.println(x1 == 1 || x2 == 2);
        System.out.println(x1 == 1 || x2 == 1);
        System.out.println(x1 == 2 || x2 == 1);
        
        System.out.println();
        //  !  =  inversão
        System.out.println(x1 == 1 && x2 == 2);
        System.out.println(!(x1 == 1 && x2 == 2));
        
        System.out.println();
        //  ^  =  Ou não 
        System.out.println(x1 == 1 ^ x2 == 2);
        System.out.println(x1 == 1 ^ x2 == 1);
        System.out.println(x1 == 2 ^ x2 == 2);
        System.out.println(x1 == 2 ^ x2 == 1);
        
        System.out.println();
    }
}
