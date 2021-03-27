package com;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.service.ArrayCalculateService;
import com.undrul.task1.service.ArrayChangeService;
import com.undrul.task1.service.ArraySearchService;
import com.undrul.task1.service.ArraySortService;


public class App {
    public static void main( String[] args ) {

        double[] array = {4,-5,6};
        CustomArray mas = new CustomArray(array);

        ArraySearchService.searchMax(mas);
        ArraySearchService.searchMin(mas);
        ArrayCalculateService.calculateSum(mas);
        ArrayCalculateService.calculateAverageValue(mas);
        ArrayCalculateService.negativePositive(mas);
        ArrayChangeService.elementReplacement(mas);

        ArraySortService.bubbleSort(mas);

        double[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        CustomArray x1 = new CustomArray(x);
         ArraySortService.shellSort(x1);
         x1.printArray();

    }
}
