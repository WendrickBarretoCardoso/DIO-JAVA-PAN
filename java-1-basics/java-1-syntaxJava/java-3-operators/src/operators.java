public class operators {
    public static void main(String[] args) {
        /// =  é o operador de ATRIBUIÇÃO
        int valor = 5; 

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
        System.out.print("\n\nValor negativo: " + (- valor));
        System.out.print("\nValor positivo: " + (+ valor));

        ///    ++ ou --   ====  Incremento ou descremento
            ///Printar na ordem   se for  ++valor incrementa depois printa
            /// Se for valor++ printa depois incrementa
        System.out.print("\n\nValor Incrementado: " + (++valor));
        System.out.print("\nValor Descrementado: " + (--valor));

        ///    !  === Negar
        boolean valores = true;

        System.out.print("\n\nPrintar BOOLEAN: " + valores);
        System.out.print("\nValor Negado: " + (!valores));

        /// ? === coondicional
        System.out.print("\n\nValor TERNÁRIO: " + (valores==true ? "verdadeiro" : "Falso"));
        System.out.print("\nValor TERNÁRIO: " + (!valores==true ? "verdadeiro" : "Falso"));

        ///   ==    :   Igual
        System.out.print("\n\nValor IGUAL: " + (valores==true ? "verdadeiro" : "Falso"));
        ///   !=    :   Diferente
        System.out.print("\nValor DIFERENTE: " + (valores!=true ? "verdadeiro" : "Falso"));

        ///    >   :    Maior
        System.out.print("\n\nValor Maior: " + (valor > --valor));
        ///    <   :   Menor
        System.out.print("\nValor Menor: " + (valor < ++valor));

        boolean valores2 = true;
        ///    Lógica E   TRUE
        System.out.print("\n\nValor E: " + (valores && valores2));
        ///    Lógica E   FALSE
        System.out.print("\nValor E: " + (valores && !valores2));
        ///    Lógica OU   TRUE
        System.out.print("\nValor E: " + (valores || !valores2));
        ///    Lógica OU   FALSE
        System.out.print("\nValor E: " + (!valores || !valores2));
        
    }
}
