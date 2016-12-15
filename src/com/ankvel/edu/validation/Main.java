package com.ankvel.edu.validation;

/**
 * @author Aleksey Kovalenko
 */
public class Main {

    public static void main(String[] args) {

        MySome mySome = new MySome();
        mySome.setCode("X1231");
        mySome.setName("ThisX1000");
        mySome.setOwner("Me");

        ValidationService validationService = new ValidationServiceImpl();
        boolean result = validationService.validate(mySome);
        System.out.println(result);

    }
}
