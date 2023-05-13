package programa;

import entidades.Carro;
import entidades.Pessoa;
import entidades.Proprietario;

public class TesteInicializacao {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "HR-V";
        meuCarro.anoFabricacao = 2016;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        Pessoa proprietario = new Pessoa();
        meuCarro.proprietario = proprietario;
        proprietario.nome = "Marcos Vinício";
        proprietario.cpf = "123456789";
        proprietario.anoNascimento = 1986;
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.println("Nome do proprietário do carro: " + meuCarro.proprietario.nome);



    }
}
