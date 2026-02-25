package br.com.gibasfilmes.moviegroovie.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DataPlot(@JsonAlias("Plot") String sinopse) {
}
