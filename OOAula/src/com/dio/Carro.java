package com.dio;

/**
 * Resoluções de exercicios da Aula de Programação Orientada a Objetos
 */
public class Carro {
    String cor;
    String modelo;
    Double capacidadeTanque;

    // CONSTRUTOR

    Carro(){

    }
    Carro(String cor, String modelo, Double capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // GET e SET
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(Double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }


    // METODO que calcula o total do valor do tanque
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

}
