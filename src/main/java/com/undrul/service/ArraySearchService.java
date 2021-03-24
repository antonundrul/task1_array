package com.undrul.service;

import com.undrul.entity.MyArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySearchService {
    private MyArray array;
    static Logger logger = LogManager.getLogger();

    public ArraySearchService(MyArray array) {
        this.array = array;
    }

    public double searchMin(){
        double min = array.getArr()[0];
        for (int i=0;i<array.getSize();i++){
            if(min>array.getArr()[i]){
                min=array.getArr()[i];
            }
        }
        logger.info("Минимальный элемент: "+ min);
        return min;
    }

    public double searchMax(){
        double max = array.getArr()[0];
        for (int i=0;i<array.getSize();i++){
            if(max<array.getArr()[i]){
                max=array.getArr()[i];
            }
        }
        logger.info("Максимальный элемент: "+max);
        return max;
    }

}