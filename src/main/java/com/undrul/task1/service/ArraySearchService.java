package com.undrul.task1.service;

import com.undrul.task1.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySearchService {

    static Logger logger = LogManager.getLogger();

    public ArraySearchService() {
    }

    public static double searchMin(CustomArray array) {
        double min = array.getArray()[0];
        for (int i = 0; i < array.getArray().length; i++) {
            if (min > array.getArray()[i]) {
                min = array.getArray()[i];
            }
        }
        logger.info("Минимальный элемент: " + min);
        return min;
    }

    public static double searchMax(CustomArray array) {
        double max = array.getArray()[0];
        for (int i = 0; i < array.getArray().length; i++) {
            if (max < array.getArray()[i]) {
                max = array.getArray()[i];
            }
        }
        logger.info("Максимальный элемент: " + max);
        return max;
    }

}