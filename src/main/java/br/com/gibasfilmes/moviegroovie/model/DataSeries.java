package br.com.gibasfilmes.moviegroovie.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DataSeries(@JsonAlias("Title") String title,@JsonAlias("Year") Integer year,@JsonAlias("imdbRating") String rating,@JsonAlias("Language") String linguagem) {
}
