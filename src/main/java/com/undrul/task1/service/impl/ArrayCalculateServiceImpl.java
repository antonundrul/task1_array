package com.undrul.task1.service.impl;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;
import com.undrul.task1.service.ArrayCalculateService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class ArrayCalculateServiceImpl implements ArrayCalculateService {
    static Logger logger = LogManager.getLogger();

    public ArrayCalculateServiceImpl() {
    }

    @Override
    public double calculateAverageValue(CustomArray array) throws ArrayException {

        logger.info("Method to calculate average value start");
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
    public double calculateAverageValueStream(CustomArray array) throws ArrayException {
        logger.info("Method to calculate average value by IntStream start");
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        double average = IntStream
                .of(array.getArray())
                .average()
                .getAsDouble();

        logger.info("Average value: " + average);

        return average;
    }

    @Override
    public int calculateSum(CustomArray array) throws ArrayException {
        logger.info("Method to calculate sum of array start");
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
    public int calculateSumStream(CustomArray array) throws ArrayException {
        logger.info("Method to calculate sum of array by IntStream start");
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        int sum = IntStream
                .of(array.getArray())
                .sum();

        logger.info("Sum of elements: " + sum);
        return sum;
    }

    @Override
    public int countNegativeElements(CustomArray array) throws ArrayException {
        logger.info("Method to count amount of negative elements in array start");
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        int negative = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] < 0) {
                negative++;
            }
        }
        logger.info("Amount of negative elements: " + negative);
        return negative;
    }

    @Override
    public int countPositiveElements(CustomArray array) throws ArrayException {
        logger.info("Method to count amount of positive elements in array start");
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        int positive = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] > 0) {
                positive++;
            }
        }
        logger.info("Amount of negative elements: " + positive);
        return positive;
    }

    @Override
    public int countNegativeElementsStream(CustomArray array) throws ArrayException {

        logger.info("Method to count amount of negative elements in array by IntStream start");

        int negative = (int) IntStream.of(array.getArray())
                .filter(num -> num < 0)
                .count();

        logger.info("Amount of negative elements: " + negative);

        return negative;
    }

    @Override
    public int countPositiveElementsStream(CustomArray array) throws ArrayException {

        logger.info("Method to count amount of positive elements in array by IntStream start");

        int positive = (int) IntStream
                .of(array.getArray())
                .filter(num -> num>0)
                .count();

        logger.info("Amount of positive elements: " + positive);

        return positive;
    }
}

