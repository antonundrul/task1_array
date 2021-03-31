package com.undrul.task1.creator;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;

public class ArrayCreator {
    public CustomArray createArray(int[] array) throws ArrayException {
        if (array == null) {
            throw new ArrayException("Array can not be NULL");
        }

        CustomArray createdArray = new CustomArray(array);
        return createdArray;
    }
}
