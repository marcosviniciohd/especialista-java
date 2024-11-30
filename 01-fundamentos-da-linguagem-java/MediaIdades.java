import java.util.Locale;
import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira idade: ");
        int idade1 = sc.nextInt();
        System.out.println("Digite a segunda idade: ");
        int idade2 = sc.nextInt();
        System.out.println("Digite a terceira idade: ");
        int idade3 = sc.nextInt();

        double media = (double) (idade1 + idade2 + idade3) / 3;

        System.out.printf("A média das idades é: %.2f%n", media);

        sc.close();
    }
}
