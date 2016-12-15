package com.ankvel.edu.validation;

/**
 * @author Aleksey Kovalenko
 */
@Constraint(validatedBy = MySomeConstraintValidator.class)
public class MySome extends BaseSome {
    private String owner;
    private String name;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
