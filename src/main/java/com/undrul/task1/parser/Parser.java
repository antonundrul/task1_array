package com.undrul.task1.parser;

import com.undrul.task1.validator.ArrayValidator;

import java.util.ArrayList;

public class Parser {

    public int[] parseToIntArray(ArrayList<String> dataFromFile) {
        int[] intArray = null;
        for (int i = 0; i < dataFromFile.size(); i++) {
            if(ArrayValidator.isValid(dataFromFile.get(i))){
                String[] array = dataFromFile.get(i).split(", ");
                intArray = new int[dataFromFile.size()];
                for(int j=0; j< dataFromFile.size();j++){
                    intArray[j] = Integer.parseInt(array[j]);
                }
            }
            break;
        }

        return intArray;
    }
}
