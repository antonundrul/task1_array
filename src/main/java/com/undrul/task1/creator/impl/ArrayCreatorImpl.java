package com.undrul.task1.creator.impl;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCreatorImpl {

    static Logger logger = LogManager.getLogger();

    public CustomArray createArray(int[] array) throws ArrayException {
        logger.info("Method to create array start");
        if (array == null) {
            throw new ArrayException("Array can not be NULL");
        }

        CustomArray createdArray = new CustomArray(array);

        logger.info("created array" + createdArray);
        return createdArray;
    }
}
