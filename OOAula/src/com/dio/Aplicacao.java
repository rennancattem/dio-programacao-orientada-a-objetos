package com.dio;

public class Aplicacao {
    public static void main(String[] args) {
        // Croamdp um objeto vazio
        Carro carro1 = new Carro();

        // Inserindo valores no objeto vazio
        carro1.setCor("Azul");
        carro1.setModelo("Nissan Versa");
        carro1.setCapacidadeTanque(45.0);

        // Imprimindo os valores inseridos atraves do mẽtodo GET
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        // Explorando a sobrecarga do METODO CONSTRUTOR passndo como parametro os valores
        Carro carro2 = new Carro("Cinza", "Nissan Kicks", 39.0);

        // Imprimindo os valores
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.45));
    }
}
