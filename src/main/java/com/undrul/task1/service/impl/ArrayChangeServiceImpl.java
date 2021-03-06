package com.undrul.task1.service.impl;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;
import com.undrul.task1.service.ArrayChangeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayChangeServiceImpl implements ArrayChangeService {
    static Logger logger = LogManager.getLogger();

    public ArrayChangeServiceImpl() {
    }

    @Override
    public void elementReplacement(CustomArray array) throws ArrayException {
        logger.info("Method replace elements start");
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] % 2 == 0) {
                array.getArray()[i] *= 5;

            }
        }
        logger.info("elements are replaced");
    }
}
