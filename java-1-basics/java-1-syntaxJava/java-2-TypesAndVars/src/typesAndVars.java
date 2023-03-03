public class typesAndVars {
    public static void main(String[] arg){

        /// Número Inteiro

        byte x = 0;  /// Muito pouca quantidade
        short x1 = 1;/// Pouca quantidade
        int x2 = 2;  /// Quantidade Normal          PADRÃO
        long x3 = 3; /// Quantidade Grande
        
        String f = "Textos";     /// Textos e frases
        boolean truthFake = true;    /// Verdadeiro ou falso
        boolean fakeTruth = false;
        char c = 'D';    /// Apenas uma letra

        float z = 2.5f;     /// Quantidade Normal   ( PRECISA BOTAR O F NO FINAL OU (float) antes do número)
        double z1 = 45.45;  /// Quantidade Grande   PADRÃO

        final int v = 1;   /// Nunca muda a variável

        System.out.print(x + x1 + x2 + x3 + z + z1 + v);
        System.out.print("\n" + f);
        System.out.print("\n" + c);
        System.out.print("\n" + truthFake);
        System.out.print("\n" + fakeTruth);
    }
}
