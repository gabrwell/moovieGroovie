package br.com.gibasfilmes.moviegroovie.main;

import br.com.gibasfilmes.moviegroovie.service.ConsumeApi;

import java.util.Scanner;

public class Main {

    private ConsumeApi consumeApi = new ConsumeApi();

    private final String ENDERECO = "http://www.omdbapi.com/?t=";

    private final String API_KEY = "apikey=dcf40bd9&";


    private Scanner readData = new Scanner(System.in);

    public void showMenu() {
        System.out.println("Your movie name: ");
        var nameMovie = readData.nextLine();
        var json = consumeApi.obterDados(ENDERECO + nameMovie.replace(" ", "+") + API_KEY);


    }
}
