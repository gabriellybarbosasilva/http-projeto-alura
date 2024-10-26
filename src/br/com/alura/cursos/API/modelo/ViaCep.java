package br.com.alura.cursos.API.modelo;

public record ViaCep(String cep, String logradouro, String complemento, String bairro,
                     String localidade, String estado, String regiao) {
}
