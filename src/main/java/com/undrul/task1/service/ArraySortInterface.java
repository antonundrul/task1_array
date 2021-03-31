package com.undrul.task1.service;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;

public interface ArraySortInterface {
    void bubbleSort(CustomArray array) throws ArrayException;

    void shellSort(CustomArray array) throws ArrayException;

    void quickSort(CustomArray array, int low, int high) throws ArrayException;
}
