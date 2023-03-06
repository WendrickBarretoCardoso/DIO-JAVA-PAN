public class operators {
    public static void main(String[] args) {
        int valor = 5;  /// =  é o operador de ATRIBUIÇÃO
        System.out.print("O Valor é: " + (valor));

        ///    +    ===  Soma
        System.out.print("\nSoma: " + (valor + 5));

        ///    -    ===  Subtração
        System.out.print("\nSubtração: " + (valor - 5));

        ///    *    ===  Multiplicação
        System.out.print("\nMultiplicação: " + (valor * 5));

        ///    /    ===  Divisão
        System.out.print("\nDivisão: " + (valor / 5));

        ///    + ou -   ===  Manipulador de valor
        System.out.print("\nValor negativo: " + (- valor));
        System.out.print("\nValor positivo: " + (+ valor));
    }
}
