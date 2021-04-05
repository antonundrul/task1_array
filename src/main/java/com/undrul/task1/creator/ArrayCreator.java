package com.undrul.task1.creator;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;

public interface ArrayCreator {
    CustomArray createArray(int[] array) throws ArrayException;
}
