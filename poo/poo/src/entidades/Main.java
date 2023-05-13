package entidades;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro();

        Pessoa proprietario = new Pessoa();
        proprietario.nome = "Marcos Vinício";
        proprietario.cpf = "123456789";
        proprietario.anoNascimento = 1986;

        meuCarro.modelo = "HR-V";
        meuCarro.anoFabricacao = 2016;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.proprietario = proprietario;

        seuCarro.anoFabricacao = 2021;
        seuCarro.modelo = "Civic";
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";


        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.println("Nome do proprietário do carro: " + meuCarro.proprietario.nome);
    }
}