public class OperadoresIgualdadeUnario {
    public static void main(String[] args) {
        /**
         * Operador de igualdade ----> ==
         * e
         * Operador de negação ---> !
         */
        boolean numerosIguais = 10 == (5 * 2);
        //System.out.printf("Números iguais: %b%n", numerosIguais );

        int numero1 = 10;
        int numero2 = 11;

        //boolean numerosDiferentes = !numerosIguais;
        //boolean numerosDiferentes = !(numero1 == numero2);

        //System.out.printf("Números diferentes: %b%n", numerosDiferentes );

        /**
         * Operador NOT EQUALS (NÃO É IGUAL) ----> != DIFERENTE
         */
        boolean numerosDiferentes = numero1 != numero2;
        System.out.printf("Números são diferentes? : %b%n", numerosDiferentes);

        /**
         * Comparação de Strings não devem sempre ser feita utilizando o ==, por não ser um tipo primitivo.
         * Exemplo:
         */
        /*String nome1 = "João";
        String nome2 = "Miguel";

        boolean nomesIguais = nome1 == nome2;
        System.out.printf("Nomes são iguais: %b%n" , nomesIguais);*/

        String nome1 = "João";
        String nome2 = "João";

        boolean nomesIguais = nome1 == nome2;
        System.out.printf("Nomes são iguais: %b%n" , nomesIguais);


    }
}