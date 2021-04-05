package com.undrul.task1.service;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;

public interface ArrayCalculateService {

    double calculateAverageValue(CustomArray array) throws ArrayException;

    double calculateAverageValueStream(CustomArray array) throws ArrayException;

    int calculateSum(CustomArray array) throws ArrayException;

    int calculateSumStream(CustomArray array) throws ArrayException;

    int countNegativeElements(CustomArray array) throws ArrayException;

    int countNegativeElementsStream(CustomArray array) throws ArrayException;

    int countPositiveElements(CustomArray array) throws ArrayException;

    int countPositiveElementsStream(CustomArray array) throws ArrayException;

}
