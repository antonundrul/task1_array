package com.undrul.task1.service;

import com.undrul.task1.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayChangeService {
    static Logger logger = LogManager.getLogger();

    public ArrayChangeService() {
    }

    public static void elementReplacement(CustomArray array) {
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] % 2 == 0) {
                array.getArray()[i] *= 5;

            }
        }

        for (int i = 0; i < array.getArray().length; i++) {
            logger.info(array.getArray()[i] + "  ");
        }
    }
}
