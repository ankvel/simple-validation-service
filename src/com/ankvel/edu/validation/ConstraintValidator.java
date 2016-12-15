package com.ankvel.edu.validation;

/**
 * @author Aleksey Kovalenko
 */
public interface ConstraintValidator<T> {
    boolean isValid(T item);
}
