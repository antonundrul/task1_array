package com;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;
import com.undrul.task1.service.ArrayCalculateService;
import com.undrul.task1.service.ArrayChangeService;
import com.undrul.task1.service.ArraySearchService;
import com.undrul.task1.service.ArraySortService;


public class App {
    public static void main(String[] args) {

        int[] array = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        CustomArray mas = new CustomArray(array);

        ArrayCalculateService calculate = new ArrayCalculateService();
        ArrayChangeService change = new ArrayChangeService();
        ArraySearchService search = new ArraySearchService();
        ArraySortService sort = new ArraySortService();
        try {
            calculate.calculateAverageValue(mas);
            calculate.calculateSum(mas);
            calculate.negativePositive(mas);

            search.searchMax(mas);
            search.searchMin(mas);

            sort.shellSort(mas);

            mas.printArray();

            change.elementReplacement(mas);

            mas.printArray();

            sort.quickSort(mas,0,mas.getArray().length-1);
            mas.printArray();
        } catch (ArrayException e) {
            e.printStackTrace();
        }

       /*double[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        CustomArray x1 = new CustomArray(x);
         //ArraySortService.shellSort(x1);
         x1.printArray();*/

    }
}
