package com.undrul.task1.service.impl;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;

public interface ArrayChangeInterface {
    void elementReplacement(CustomArray array) throws ArrayException;
}
