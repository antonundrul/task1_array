package com.undrul.task1.parser.impl;

import com.undrul.task1.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class ArrayParserImpl {

    static Logger logger = LogManager.getLogger();

    public int[] parseToIntArray(ArrayList<String> dataFromFile) {
        logger.info("Method to parse data from file start");
        int[] intArray = null;
        for (int i = 0; i < dataFromFile.size(); i++) {
            if(ArrayValidator.isValid(dataFromFile.get(i))){
                String[] array = dataFromFile.get(i).split(", ");
                intArray = new int[dataFromFile.size()];
                for(int j=0; j< dataFromFile.size();j++){
                    intArray[j] = Integer.parseInt(array[j]);
                }
                break;
            }

        }

        return intArray;
    }
}
