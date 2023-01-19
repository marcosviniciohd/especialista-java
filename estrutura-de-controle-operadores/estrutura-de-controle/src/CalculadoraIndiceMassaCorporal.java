import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        int peso = sc.nextInt();
        System.out.print("Digite seu altura: ");
        double altura = sc.nextDouble();

        double imc  = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.printf("Abaixo do peso ideal. Seu IMC é: %.2f", imc);
        } else if (imc >= 18.5 && imc < 25) {
            System.out.printf("Peso ideal. Seu IMC é: %.2f", imc);
        } else if (imc >= 25 && imc < 30) {
            System.out.printf("Acima do peso ideal. Seu IMC é: %.2f", imc);
        } else if (imc >= 30 && imc < 35) {
            System.out.printf("Obesidade grau I. Seu IMC é: %.2f", imc);
        } else if (imc >= 35 && imc < 40) {
            System.out.printf("Obsidade grau II. Seu IMC é: %.2f", imc);
        } else if (imc >= 40) {
            System.out.printf("Obsidade grau III. Seu IMC é: %.2f", imc);
        }
    }
}
