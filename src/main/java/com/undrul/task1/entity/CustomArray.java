package com.undrul.task1.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArray {

    static Logger logger = LogManager.getLogger();
    private int[] array;

    public CustomArray() {
    }

    public CustomArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            logger.info(array[i]);
        }
    }
}
