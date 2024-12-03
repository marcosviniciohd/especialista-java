package desafios;

public class VariaveisEOperadoresAritmeticos {
    public static final Integer NUMERO_DE_VENDAS = 3;
    public static void main(String[] args) {
        double primeiraVenda = 20;
        double segundaVenda = 30;
        double terceiraVenda = 100;

        double mediaDasVendasRealizadas = (primeiraVenda + segundaVenda + terceiraVenda) / NUMERO_DE_VENDAS;

        System.out.printf("A média das vendas realizadas é R$ %.2f%n" , mediaDasVendasRealizadas);
    }
}
