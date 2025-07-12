import java.util.Scanner;

public class EstruturaDeControleSwitch {
    public static void main(String[] args) {
        System.out.println("Avalie nosso atendimento (1 a 5): ");
        Scanner input = new Scanner(System.in);
        int nota = input.nextInt();
        String descricaoNota;

        switch (nota) {
            case 1:
                descricaoNota = "Muito ruim";
                break;
            case 2:
                descricaoNota = "Ruim";
                break;
            case 3:
                descricaoNota = "Razoável";
                break;
            case 4:
                descricaoNota = "Muito bom";
                break;
            case 5:
                descricaoNota = "Excelente";
                break;
            default:
                descricaoNota = "Opção inválida";
                break;
        }

        System.out.println("Avaliação é " + descricaoNota);

    }
}
