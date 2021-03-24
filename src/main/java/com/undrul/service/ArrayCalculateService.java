package com.undrul.service;

import com.undrul.entity.MyArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCalculateService {
    static Logger logger = LogManager.getLogger();
    private MyArray array;

    public ArrayCalculateService(MyArray array) {
        this.array = array;
    }

    public double calculateAverageValue(){
        double average=0;

        for(int i=0; i< array.getSize();i++){
            average+=array.getArr()[i];
        }
        average/=array.getSize();

        logger.info("Среднее значение: " + average);
        return average;
    }

    public double calculateSum(){

        double sum=0;

        for(int i=0; i< array.getSize();i++){
            sum+=array.getArr()[i];
        }

        logger.info("Сумма элементов: "+sum);
        return sum;
    }

    public void negativePositive(){
        int negative=0, positive=0;
        for(int i=0; i< array.getSize();i++){
            if(array.getArr()[i]<0){
                negative++;
            }
            else{
                positive++;
            }
        }
        logger.info("Количество положительных элементов: "+positive+"\n" +
                "Количество отрицательных элементов: "+negative);
    }
}

