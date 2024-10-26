package br.com.alura.cursos.API.HTTP;

import br.com.alura.cursos.API.modelo.ApiCep;
import br.com.alura.cursos.API.modelo.ViaCep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTTP {

    public ApiCep buscaEndereco(String cep) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder().create();
        String endereco = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Deserializa JSON para ViaCep
        ViaCep viaCep = gson.fromJson(response.body(), ViaCep.class);
        return new ApiCep(viaCep);
    }
}