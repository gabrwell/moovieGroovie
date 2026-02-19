package br.com.gibasfilmes.moviegroovie.service;

import br.com.gibasfilmes.moviegroovie.model.DataSeries;
import tools.jackson.databind.ObjectMapper;

public class ConvertData implements IConvertDatas {
    private ObjectMapper mapper = new ObjectMapper();


    @Override
    public <T> T getDatas(String json, Class<T> classe) {
        return mapper.readValue(json, classe);
    }
}
