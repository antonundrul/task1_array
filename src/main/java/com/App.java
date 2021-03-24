package com;

import com.undrul.entity.MyArray;
import com.undrul.service.ArrayCalculateService;
import com.undrul.service.ArrayChangeService;
import com.undrul.service.ArraySearchService;


public class App {
    public static void main( String[] args ) {

        double[] arr = {4,-5,6};
        MyArray mas = new MyArray();
        mas.setArr(arr);

        ArraySearchService search = new ArraySearchService(mas);
        ArrayCalculateService calculate = new ArrayCalculateService(mas);
        ArrayChangeService change = new ArrayChangeService(mas);
        search.searchMax();
        search.searchMin();
        calculate.calculateSum();
        calculate.calculateAverageValue();
        calculate.negativePositive();
        change.elementReplacement();

    }
}
