package br.com.gibasfilmes.moviegroovie;

import br.com.gibasfilmes.moviegroovie.model.DataSeries;
import br.com.gibasfilmes.moviegroovie.service.ConsumeApi;
import br.com.gibasfilmes.moviegroovie.service.ConvertData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviegroovieApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MoviegroovieApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        var consumeApi = new ConsumeApi();
        var json = consumeApi.obterDados("http://www.omdbapi.com/?apikey=dcf40bd9&t=American+Psycho");
        System.out.println(json);

        ConvertData converterDados = new ConvertData();
        DataSeries dados = converterDados.getDatas(json, DataSeries.class);
        System.out.println(dados);
        
    }
}
