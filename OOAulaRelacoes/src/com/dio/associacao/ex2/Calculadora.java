package com.dio.associacao.ex2;

public class Calculadora implements OperacaoMatematica{

    @Override
    public void soma(double numero1, double numero2){
        System.out.println("Soma: " + (numero1 + numero2));
    }

    @Override
    public void subtracao(double numero1, double numero2){
        System.out.println("Soma: " + (numero1 - numero2));
    }s d

    @Override
    public void multiplicacao(double numero1, double numero2){
        System.out.println("Soma: " + (numero1 * numero2));
    }

    @Override
    public void divisao(double numero1, double numero2){
        System.out.println("Soma: " + (numero1 / numero2));
    }
}
