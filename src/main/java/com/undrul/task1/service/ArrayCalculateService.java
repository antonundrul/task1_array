package com.undrul.task1.service;

import com.undrul.task1.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCalculateService {
    static Logger logger = LogManager.getLogger();

    public ArrayCalculateService() {
    }

    public static double calculateAverageValue(CustomArray array) {
        double average = 0;

        for (int i = 0; i < array.getArray().length; i++) {
            average += array.getArray()[i];
        }
        average /= array.getArray().length;

        logger.info("Среднее значение: " + average);
        return average;
    }

    public static double calculateSum(CustomArray array) {

        double sum = 0;

        for (int i = 0; i < array.getArray().length; i++) {
            sum += array.getArray()[i];
        }

        logger.info("Сумма элементов: " + sum);
        return sum;
    }

    public static void negativePositive(CustomArray array) {
        int negative = 0, positive = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] < 0) {
                negative++;
            } else {
                positive++;
            }
        }
        logger.info("Количество положительных элементов: " + positive + "\n" +
                "Количество отрицательных элементов: " + negative);
    }
}

