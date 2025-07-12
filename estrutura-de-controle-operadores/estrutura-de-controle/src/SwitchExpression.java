import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite um dia da semana (Ex.: seg, ter, qua, qui, etc): ");
        String diaDaSemana = input.nextLine();
        String horarioFuncionamento = switch (diaDaSemana) {
            case "seg" -> "Fechado";
            case "ter", "qua", "qui", "sex" -> "08:00h às 18:00h";
            case "sab", "dom" -> "08:00h às 12:00h";
            default -> "Dia inválido";
        };

//        String horarioFuncionamento;
//
//        switch (diaDaSemana) {
//            case "seg" -> horarioFuncionamento = "Fechado";
//            case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00h às 18:00h";
//            case "sab", "dom" -> horarioFuncionamento = "08:00h às 12:00h";
//            default -> horarioFuncionamento = "Dia inválido";
//        }
        System.out.println("Horário de funcionamento: " + horarioFuncionamento);
    }
}
