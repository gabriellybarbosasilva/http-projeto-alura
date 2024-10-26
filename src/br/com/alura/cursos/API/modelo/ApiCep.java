package br.com.alura.cursos.API.modelo;

public class ApiCep {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String estado;
    private String regiao;

    public ApiCep(ViaCep viaCep) {
        this.cep = viaCep.cep();
        this.logradouro = viaCep.logradouro();
        this.complemento = viaCep.complemento();
        this.bairro = viaCep.bairro();
        this.localidade = viaCep.localidade();
        this.estado = viaCep.estado();
        this.regiao = viaCep.regiao();
    }

    @Override
    public String toString() {
        return "CEP: " + cep + "\n" +
                "Logradouro: " + logradouro + "\n" +
                "Complemento: " + complemento + "\n" +
                "Bairro: " + bairro + "\n" +
                "Localidade: " + localidade + "\n" +
                "Estado: " + estado + "\n" +
                "Região: " + regiao;
    }
}