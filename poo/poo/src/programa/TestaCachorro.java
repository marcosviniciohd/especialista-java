package programa;

import entidades.*;
import entidades.Cachorro;

public class TestaCachorro {
    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro();
        Cachorro dog2 = new Cachorro();

        dog1.idade = 4;
        dog1.nome = "Thor";
        dog1.raca = "Pastor";
        dog1.sexo = "M";

        dog2.nome = "Pepita";
        dog2.raca = "Coquer";
        dog2.sexo = "F";
        dog2.idade = 10;

        System.out.println("Informações sobre os cachorros: ");
        System.out.println("Nome: " + dog1.nome);
        System.out.println("Idade: " + dog1.idade);
        System.out.println("Raça: " + dog1.raca);
        System.out.println("Sexo: " + dog1.sexo);
        System.out.println("------------------------------------------------");
        System.out.println("Informações sobre os cachorros: ");
        System.out.println("Nome: " + dog2.nome);
        System.out.println("Idade: " + dog2.idade);
        System.out.println("Raça: " + dog2.raca);
        System.out.println("Sexo: " + dog2.sexo);

    }
}
