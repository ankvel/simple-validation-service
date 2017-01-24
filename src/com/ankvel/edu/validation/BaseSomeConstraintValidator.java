package com.ankvel.edu.validation;

/**
 * @author Aleksey Kovalenko
 */

public class BaseSomeConstraintValidator<T extends BaseSome> implements ConstraintValidator<T>{
    public boolean isValid(T item) {
        String code = item.getCode();
        return code != null && code.length() > 2;
    }
}

/*
public class BaseSomeConstraintValidator implements ConstraintValidator<BaseSome>{
    public boolean isValid(BaseSome item) {
        String code = item.getCode();
        return code != null && code.length() > 2;
    }
}*/
