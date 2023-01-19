import java.util.Scanner;
//Desejável: acima de 20 ng/ML
//Grupo de rico: 30 a 60 ng/ML
public class ExameVitaminaD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Grupo de risco: ");
        boolean grupoDeRisco = sc.nextBoolean();

        System.out.print("Vitamina D: ");
        double vitaminaD = sc.nextDouble(); //nanograma por mililitro
        boolean vitaminaNormal = (!grupoDeRisco && vitaminaD > 20) || (grupoDeRisco && vitaminaD >= 30 && vitaminaD <= 60);

        System.out.printf("Vitamina D normal: %b%n", vitaminaNormal);

        sc.close();
    }
}
