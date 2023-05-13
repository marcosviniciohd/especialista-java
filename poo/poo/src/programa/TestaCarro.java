package programa;

import entidades.Carro2;
import entidades.Proprietario;

public class TestaCarro {
    public static void main(String[] args) {
        Carro2 carro2 = new Carro2();
        Carro2 meucarro = new Carro2();

       /* carro2.fabricante = "Fiat";
        carro2.modelo = "Uno";
        carro2.cor = "Vermelho";
        carro2.anoFabricacao = 2011;*/

        meucarro.fabricante = "Honda";
        meucarro.modelo = "Fit";
        meucarro.cor = "Prata";
        meucarro.anoFabricacao = 2013;

        /*meucarro.proprietario = new entidades.Proprietario();
        meucarro.proprietario.nome = "João da Silva";
        meucarro.proprietario.cpf = "11111111111";
        meucarro.proprietario.anoDeNascimento = 1975;*/

        Proprietario dono = new Proprietario();
        dono.nome = "João da Silva";
        dono.cpf = "11111111111";
        dono.anoDeNascimento = 1975;

        meucarro.proprietario = dono;


        System.out.printf("Meu carro é um %s %s %s %d %s\n", meucarro.fabricante, meucarro.modelo, meucarro.cor, meucarro.anoFabricacao, meucarro.proprietario.nome);
        System.out.printf("entidades.Carro2 é um %s %s %s %d\n", carro2.fabricante, carro2.modelo, carro2.cor, carro2.anoFabricacao);


    }
}
