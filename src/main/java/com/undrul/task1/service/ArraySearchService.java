package com.undrul.task1.service;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;

public interface ArraySearchService {
    int searchMax(CustomArray array) throws ArrayException;

    int findMaxElementStream(CustomArray array) throws ArrayException;

    int searchMin(CustomArray array) throws ArrayException;

    int findMinElementStream(CustomArray array) throws ArrayException;
}
