package com.undrul.service;

import com.undrul.entity.MyArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayChangeService {
    static Logger logger = LogManager.getLogger();
    private MyArray array;

    public ArrayChangeService(MyArray array) {
        this.array = array;
    }

    public void elementReplacement(){
        for(int i=0;i< array.getSize();i++){
            if(array.getArr()[i]%2==0){
                array.getArr()[i]*=5;

            }
        }

        for(int i=0;i< array.getSize();i++) {
            logger.info(array.getArr()[i]+"  ");
        }
    }
}
