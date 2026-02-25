package br.com.gibasfilmes.moviegroovie.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DataCast(@JsonAlias("Director") String director,@JsonAlias("Actors") String actors,@JsonAlias("Writer") String writers) {
}
