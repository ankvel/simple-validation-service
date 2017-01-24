package com.ankvel.edu.validation;

/**
 * @author Aleksey Kovalenko
 */
public class ValidationServiceImpl implements ValidationService {
    @Override
    public <T> boolean validate(T item) {

        Class<?> clazz = item.getClass();
        Constraint constraint = getConstraint(clazz);

        if (constraint == null) {
            return true;
        }

        Class<? extends ConstraintValidator> validatorClass = constraint.validatedBy();
        try {
            ConstraintValidator<T> constraintValidator = (ConstraintValidator<T>)validatorClass.newInstance();
            return constraintValidator.isValid(item);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Constraint getConstraint(Class<?> clazz) {
        Constraint declaredAnnotation = clazz.getDeclaredAnnotation(Constraint.class);
        return declaredAnnotation;
    }
}
