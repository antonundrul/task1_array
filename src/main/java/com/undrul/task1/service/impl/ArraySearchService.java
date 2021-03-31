package com.undrul.task1.service.impl;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;
import com.undrul.task1.service.ArraySearchInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class ArraySearchService implements ArraySearchInterface {

    static Logger logger = LogManager.getLogger();

    public ArraySearchService() {
    }

    @Override
    public int searchMin(CustomArray array) throws ArrayException {
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        int stream = IntStream.of(array.getArray()).min().getAsInt();

        int min = array.getArray()[0];
        for (int i = 0; i < array.getArray().length; i++) {
            if (min > array.getArray()[i]) {
                min = array.getArray()[i];
            }
        }
        logger.info("Min element: " + stream);
        return stream;
    }

    @Override
    public int searchMax(CustomArray array) throws ArrayException {
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        int max = array.getArray()[0];
        for (int i = 0; i < array.getArray().length; i++) {
            if (max < array.getArray()[i]) {
                max = array.getArray()[i];
            }
        }
        logger.info("Max element: " + max);
        return max;
    }

    @Override
    public int findMinElementStream(CustomArray array) throws ArrayException {
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        int minElement = IntStream
                .of(array.getArray())
                .min()
                .getAsInt();

        logger.info("Min element: " + minElement);

        return minElement;
    }

    @Override
    public int findMaxElementStream(CustomArray array) throws ArrayException {
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        int maxElement = IntStream
                .of(array.getArray())
                .max()
                .getAsInt();

        logger.info("Max element: " + maxElement);

        return maxElement;
    }
}