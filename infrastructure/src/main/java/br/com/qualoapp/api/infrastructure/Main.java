package br.com.qualoapp.api.infrastructure;

import br.com.qualoapp.api.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(new UseCase().execute());
    }
}