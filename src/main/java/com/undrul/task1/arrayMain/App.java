package com.undrul.task1.arrayMain;

import com.undrul.task1.creator.impl.ArrayCreatorImpl;
import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;
import com.undrul.task1.parser.impl.ArrayParserImpl;
import com.undrul.task1.reader.impl.DataReaderImpl;
import com.undrul.task1.service.impl.ArrayCalculateServiceImpl;
import com.undrul.task1.service.impl.ArraySearchServiceImpl;

import java.util.ArrayList;


public class App {
    public static void main(String[] args) {

      /*  int[] array = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        CustomArray mas = new CustomArray(array);

        ArrayCalculateServiceImpl calculate = new ArrayCalculateServiceImpl();
        ArrayChangeServiceImpl change = new ArrayChangeServiceImpl();
        ArraySearchServiceImpl search = new ArraySearchServiceImpl();
        ArraySortServiceServiceImpl sort = new ArraySortServiceServiceImpl();
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
        DataReaderImpl dataReaderImpl = new DataReaderImpl();
        ArrayParserImpl parser = new ArrayParserImpl();
        ArrayCreatorImpl arrayCreatorImpl = new ArrayCreatorImpl();
        try {
            ArrayList<String> list = dataReaderImpl.readDataFromFile("./src/main/resources/data/data.txt");
            System.out.println(list);

            int[] mas1 = parser.parseToIntArray(list);

            CustomArray customArray  = arrayCreatorImpl.createArray(mas1);


            ArrayCalculateServiceImpl calculate1 = new ArrayCalculateServiceImpl();
            ArraySearchServiceImpl search1 = new ArraySearchServiceImpl();

           // calculate1.negativePositiveStream(customArray);
            calculate1.calculateAverageValueStream(customArray);
            calculate1.calculateSumStream(customArray);

            search1.findMaxElementStream(customArray);
            search1.findMinElementStream(customArray);



        } catch (ArrayException e) {
            e.printStackTrace();
        }



    }
}
