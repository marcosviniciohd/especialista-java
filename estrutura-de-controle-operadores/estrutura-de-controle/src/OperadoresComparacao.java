public class OperadoresComparacao {
    public static void main(String[] args) {
        int pesoProdutos = 900;
        int limitePesoCaminhao = 1000;

        boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;
        System.out.printf("O limite de carga foi excedida? : %b%n", cargaExcedida);

        //boolean cargaLiberada = pesoProdutos < limitePesoCaminhao;
        boolean cargaLiberada = pesoProdutos <= limitePesoCaminhao;
        System.out.printf("A carga está liberada para transporte? : %b%n", cargaLiberada);
    }
}
