    package br.com.gibasfilmes.moviegroovie.main;

    import br.com.gibasfilmes.moviegroovie.model.DataAwards;
    import br.com.gibasfilmes.moviegroovie.model.DataCast;
    import br.com.gibasfilmes.moviegroovie.model.DataPlot;
    import br.com.gibasfilmes.moviegroovie.model.DataSeries;
    import br.com.gibasfilmes.moviegroovie.service.ConsumeApi;
    import br.com.gibasfilmes.moviegroovie.service.ConvertData;

    import java.util.Scanner;

    public class Main {

        private ConsumeApi consumeApi = new ConsumeApi();

        private ConvertData converterDados = new ConvertData();


        private final String ENDERECO = "http://www.omdbapi.com/?t=";

        private final String API_KEY = "&apikey=dcf40bd9&";


        private Scanner readData = new Scanner(System.in);

        public void showMenu() {
            System.out.println("Your movie name: ");
            var nameMovie = readData.nextLine();
            var json = consumeApi.obterDados(ENDERECO + nameMovie.replace(" ", "+") + API_KEY);

            DataSeries data = converterDados.getDatas(json, DataSeries.class);
            System.out.println(data);
            DataPlot dataPlot = converterDados.getDatas(json, DataPlot.class);
            System.out.println(dataPlot);
            DataCast dataCast = converterDados.getDatas(json, DataCast.class);
            System.out.println(dataCast);
            DataAwards dataAwards = converterDados.getDatas(json, DataAwards.class);
            System.out.println(dataAwards);
        }
    }
