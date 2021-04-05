package com.undrul.task1.service;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;

public interface ArrayChangeService {
    void elementReplacement(CustomArray array) throws ArrayException;
}
