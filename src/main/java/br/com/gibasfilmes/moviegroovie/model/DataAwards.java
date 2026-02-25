package br.com.gibasfilmes.moviegroovie.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DataAwards(@JsonAlias("Awards") String awards) {
}
