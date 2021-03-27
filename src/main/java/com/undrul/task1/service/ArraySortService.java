package com.undrul.task1.service;

import com.undrul.task1.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortService {
    static Logger logger = LogManager.getLogger();

    public ArraySortService() {
    }

    public static void bubbleSort(CustomArray array) {
        for (int out = array.getArray().length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (array.getArray()[in] > array.getArray()[in + 1]) {
                    double temp = array.getArray()[in];
                    array.getArray()[in] = array.getArray()[in + 1];
                    array.getArray()[in + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(CustomArray array, int low, int high) {
        if (array.getArray().length == 0) {
            return;//завершить выполнение если длина массива равна 0
        }

        if (low >= high) {
            return;//завершить выполнение если уже нечего делить
        }
        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        double opora = array.getArray()[(int) middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array.getArray()[i] < opora) {
                i++;
            }

            while (array.getArray()[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                double temp = array.getArray()[i];
                array.getArray()[i] = array.getArray()[j];
                array.getArray()[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j) {
            quickSort(array, low, j);
        }

        if (high > i) {
            quickSort(array, i, high);
        }
    }

    public static void shellSort(CustomArray array) {
        int gap = array.getArray().length / 2;
// Пока разница между элементами есть
        while (gap >= 1) {
            for (int right = 0; right < array.getArray().length; right++) {
                // Смещаем правый указатель, пока не сможем найти такой, что
                // между ним и элементом до него не будет нужного промежутка
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array.getArray()[c] > array.getArray()[c + gap]) {
                        double temp = array.getArray()[c];
                        array.getArray()[c] = array.getArray()[c + gap];
                        array.getArray()[c + gap] = temp;
                    }
                }
            }
            // Пересчитываем разрыв
            gap = gap / 2;
        }
    }


}
