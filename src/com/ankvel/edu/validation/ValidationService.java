package com.ankvel.edu.validation;

/**
 * @author Aleksey Kovalenko
 */
public interface ValidationService {
    <T> boolean validate(T item);
}
