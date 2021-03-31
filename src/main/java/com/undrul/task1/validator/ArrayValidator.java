package com.undrul.task1.validator;

public class ArrayValidator {

    public static boolean isValid(String line) {
        String[] array = line.split(", ");
        boolean valid = true;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].matches("-?\\d+")) {
                valid = false;
                break;
            }
        }
        return valid;
    }
}
