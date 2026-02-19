package br.com.gibasfilmes.moviegroovie.service;

public interface IConvertDatas {

    <T> T getDatas(String json, Class<T> classe);
}
