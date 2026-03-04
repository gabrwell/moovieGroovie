package br.com.gibasfilmes.moviegroovie;

import br.com.gibasfilmes.moviegroovie.main.Main;
import br.com.gibasfilmes.moviegroovie.model.DataAwards;
import br.com.gibasfilmes.moviegroovie.model.DataCast;
import br.com.gibasfilmes.moviegroovie.model.DataPlot;
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
        Main main = new Main();
        main.showMenu();



    }
}
