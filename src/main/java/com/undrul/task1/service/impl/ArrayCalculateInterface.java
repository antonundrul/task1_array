package com.undrul.task1.service.impl;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;

public interface ArrayCalculateInterface {
    double calculateAverageValue(CustomArray array) throws ArrayException;

    int calculateSum(CustomArray array) throws ArrayException;

    void negativePositive(CustomArray array) throws ArrayException;
}
