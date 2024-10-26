package br.com.alura.cursos.API.Main;

import br.com.alura.cursos.API.HTTP.HTTP;
import br.com.alura.cursos.API.modelo.ApiCep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<ApiCep> enderecos = new ArrayList<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        HTTP http = new HTTP();
        Scanner scanner = new Scanner(System.in);
        String busca;

        while (true) {
            System.out.println("Digite seu CEP sem incluir o hífen ou digite 'sair' para encerrar:");
            busca = scanner.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                ApiCep endereco = http.buscaEndereco(busca);
                enderecos.add(endereco);
                System.out.println("Endereço encontrado:");
                System.out.println(endereco);

            } catch (IOException | InterruptedException e) {
                System.out.println("Erro ao buscar o CEP: " + e.getMessage());
            }
        }

        String json = gson.toJson(enderecos);
        System.out.println("Lista de endereços em JSON:");
        System.out.println(json);

        try (Writer writer = new FileWriter("enderecos.txt")) {
            writer.write(json);
            System.out.println("Endereços gravados em enderecos.txt");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}