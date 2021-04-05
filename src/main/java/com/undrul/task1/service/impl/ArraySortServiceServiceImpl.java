package com.undrul.task1.service.impl;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;
import com.undrul.task1.service.ArraySortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortServiceServiceImpl implements ArraySortService {
    static Logger logger = LogManager.getLogger();

    public ArraySortServiceServiceImpl() {
    }

    @Override
    public void bubbleSort(CustomArray array) throws ArrayException {
        logger.info("Method to sort array by bubbleSort start");
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }
        for (int out = array.getArray().length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (array.getArray()[in] > array.getArray()[in + 1]) {
                    int temp = array.getArray()[in];
                    array.getArray()[in] = array.getArray()[in + 1];
                    array.getArray()[in + 1] = temp;
                }
            }
        }
    }

    @Override
    public void quickSort(CustomArray array, int low, int high) throws ArrayException {
        logger.info("Method to sort array by quickSort start");
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        if (low >= high) {
            throw new ArrayException("low >= high");
        }
        int middle = low + (high - low) / 2;
        int opora = array.getArray()[(int) middle];

        int i = low, j = high;
        while (i <= j) {
            while (array.getArray()[i] < opora) {
                i++;
            }

            while (array.getArray()[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array.getArray()[i];
                array.getArray()[i] = array.getArray()[j];
                array.getArray()[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(array, low, j);
        }

        if (high > i) {
            quickSort(array, i, high);
        }
    }

    @Override
    public void shellSort(CustomArray array) throws ArrayException {
        logger.info("Method to sort array by shellSort start");
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        int gap = array.getArray().length / 2;
        while (gap >= 1) {
            for (int right = 0; right < array.getArray().length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array.getArray()[c] > array.getArray()[c + gap]) {
                        int temp = array.getArray()[c];
                        array.getArray()[c] = array.getArray()[c + gap];
                        array.getArray()[c + gap] = temp;
                    }
                }
            }
            gap = gap / 2;
        }
    }

}
