package com.dio.heranca.ex2;

public class AplicacaoEx2 {
    public static void main(String[] args) {
        // Criando a classe objeto Funcionario
        Funcionario funcionario = new Funcionario();

        // Criando os Upcast com os respectivos subtitulos
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Criando o Downcast da classe mãe Funcionário para o subtitulo Vendedor
        Vendedor vendedor1 = (Vendedor) new Funcionario();
    }
}
