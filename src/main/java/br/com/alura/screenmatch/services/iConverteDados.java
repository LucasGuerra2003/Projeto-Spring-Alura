package br.com.alura.screenmatch.services;

public interface iConverteDados {
    <T> T obterDados(String json, Class<T> classe);

}
