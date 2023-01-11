public class CurtoCircuitoOperadores {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        /**
         * Se a primeira expressão for verdadeira a JVM não irá analisar a segunda expressão, portando o y não será incrementado.
         * Tanto o operador && e o || são operadores de curto circuito.
         */
        //boolean resultado = x == 10 && y++ ==20;
        boolean resultado = x == 10 || y++ ==20;
        System.out.println(resultado);
        System.out.println(y);
    }
}
