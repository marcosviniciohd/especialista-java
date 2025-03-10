package desafios;

public class CalculadoraIdadeMedia {
    public static void main(String[] args) {
        int idade1 = 30;
        int idade2 = 40;
        int idade3 = 60;

        double media = (idade1 + idade2 + idade3) / 3;
        System.out.printf("A média das idades é: %.2f", media);
    }
}
