package com.undrul.task1.service.impl;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;

public interface ArraySearchInterface {
    int searchMax(CustomArray array) throws ArrayException;

    int searchMin(CustomArray array) throws ArrayException;
}
