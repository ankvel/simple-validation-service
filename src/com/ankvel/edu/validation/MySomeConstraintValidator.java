package com.ankvel.edu.validation;

/**
 * @author Aleksey Kovalenko
 */

public class MySomeConstraintValidator<T extends MySome> extends BaseSomeConstraintValidator<T> {
    @Override
    public boolean isValid(T item) {
        boolean superResult = super.isValid(item);
        return superResult && (item.getOwner() != null);
    }
}

/*

public class MySomeConstraintValidator implements ConstraintValidator<MySome> {
    @Override
    public boolean isValid(MySome item) {
        ConstraintValidator<BaseSome> baseSomeValidator = new BaseSomeConstraintValidator();

        boolean superResult = baseSomeValidator.isValid(item);
        return superResult && (item.getOwner() != null);
    }
}
*/

