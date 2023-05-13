package programa;

import entidades.Carro;
import entidades.Pessoa;

public class TestaReferencia {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João das Dores";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";

        Carro meuCarro = new Carro();
        meuCarro.modelo = "HR-V";

        Carro seuCarro = new Carro();
        seuCarro.modelo = "Civic";
        meuCarro.proprietario = pessoa1;
        seuCarro.proprietario = pessoa2;
        meuCarro.proprietario.nome = "Sebastiao";


       /* System.out.println(seuCarro.proprietario.nome);
        System.out.println(meuCarro.proprietario.nome);*/



        System.out.println(meuCarro.proprietario.nome);
        System.out.println(seuCarro.proprietario.nome);

    }
}