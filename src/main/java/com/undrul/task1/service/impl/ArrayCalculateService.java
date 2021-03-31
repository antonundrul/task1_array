package com.undrul.task1.service.impl;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;
import com.undrul.task1.service.ArrayCalculateInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCalculateService implements ArrayCalculateInterface {
    static Logger logger = LogManager.getLogger();

    public ArrayCalculateService() {
    }

    @Override
    public double calculateAverageValue(CustomArray array) throws ArrayException {
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        double average = 0;

        for (int i = 0; i < array.getArray().length; i++) {
            average += array.getArray()[i];
        }
        average /= array.getArray().length;

        logger.info("Average value: " + average);
        return average;
    }

    @Override
    public int calculateSum(CustomArray array) throws ArrayException {
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        int sum = 0;

        for (int i = 0; i < array.getArray().length; i++) {
            sum += array.getArray()[i];
        }

        logger.info("Sum of elements: " + sum);
        return sum;
    }

    @Override
    public void negativePositive(CustomArray array) throws ArrayException {
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        int negative = 0, positive = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] < 0) {
                negative++;
            } else {
                positive++;
            }
        }
        logger.info("Amount of positive elements: " + positive + "\n" +
                "Amount of negative elements: " + negative);
    }
}

