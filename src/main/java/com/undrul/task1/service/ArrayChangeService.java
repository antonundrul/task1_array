package com.undrul.task1.service;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;
import com.undrul.task1.service.impl.ArrayChangeInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayChangeService implements ArrayChangeInterface {
    static Logger logger = LogManager.getLogger();

    public ArrayChangeService() {
    }

    @Override
    public void elementReplacement(CustomArray array) throws ArrayException {
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] % 2 == 0) {
                array.getArray()[i] *= 5;

            }
        }

    }
}
