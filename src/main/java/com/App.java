package com;

import com.undrul.task1.creator.ArrayCreator;
import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;
import com.undrul.task1.parser.Parser;
import com.undrul.task1.reader.Reader;
import com.undrul.task1.service.impl.ArrayCalculateService;
import com.undrul.task1.service.impl.ArrayChangeService;
import com.undrul.task1.service.impl.ArraySearchService;
import com.undrul.task1.service.impl.ArraySortService;

import java.io.IOException;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {

      /*  int[] array = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        CustomArray mas = new CustomArray(array);

        ArrayCalculateService calculate = new ArrayCalculateService();
        ArrayChangeService change = new ArrayChangeService();
        ArraySearchService search = new ArraySearchService();
        ArraySortService sort = new ArraySortService();
        try {
            calculate.calculateAverageValue(mas);
            calculate.calculateSum(mas);
            calculate.negativePositive(mas);
            calculate.negativePositiveStream(mas);

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
*/
        Reader reader = new Reader();
        Parser parser = new Parser();
        ArrayCreator arrayCreator = new ArrayCreator();
        try {
            ArrayList<String> list = reader.readFile("C:\\epam\\task1_array\\src\\main\\resources\\data\\data.txt");
            System.out.println(list);

            int[] mas1 = parser.parseToIntArray(list);

            CustomArray customArray  = arrayCreator.createArray(mas1);


            ArrayCalculateService calculate1 = new ArrayCalculateService();
            ArraySearchService search1 = new ArraySearchService();

            calculate1.negativePositiveStream(customArray);
            calculate1.calculateAverageValueStream(customArray);
            calculate1.calculateSumStream(customArray);

            search1.findMaxElementStream(customArray);
            search1.findMinElementStream(customArray);



        } catch (ArrayException e) {
            e.printStackTrace();
        }



    }
}
