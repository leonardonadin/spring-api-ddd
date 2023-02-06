package br.com.qualoapp.api.domain.category;

import br.com.qualoapp.api.domain.validation.Error;
import br.com.qualoapp.api.domain.validation.ValidationHandler;
import br.com.qualoapp.api.domain.validation.Validator;

public class CategoryValidator extends Validator {

    private final Category category;

    public CategoryValidator(final Category aCategory, final ValidationHandler aHandler) {
        super(aHandler);
        this.category = aCategory;
    }

    @Override
    public void validate() {
        if(this.category.getName() == null) {
            this.validationHandler().append(new Error("'name' should not be null"));
        }
    }
}
