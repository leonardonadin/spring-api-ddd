package br.com.qualoapp.api.application;

import br.com.qualoapp.api.domain.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}