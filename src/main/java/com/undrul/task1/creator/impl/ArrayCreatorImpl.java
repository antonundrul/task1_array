package com.undrul.task1.creator.impl;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;

public class ArrayCreatorImpl {
    public CustomArray createArray(int[] array) throws ArrayException {
        if (array == null) {
            throw new ArrayException("Array can not be NULL");
        }

        CustomArray createdArray = new CustomArray(array);
        return createdArray;
    }
}
