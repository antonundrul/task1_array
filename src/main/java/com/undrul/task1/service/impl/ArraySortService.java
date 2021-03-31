package com.undrul.task1.service.impl;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;
import com.undrul.task1.service.ArraySortInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortService implements ArraySortInterface {
    static Logger logger = LogManager.getLogger();

    public ArraySortService() {
    }

    @Override
    public void bubbleSort(CustomArray array) throws ArrayException {
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }
        for (int out = array.getArray().length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (array.getArray()[in] > array.getArray()[in + 1]) {
                    int temp = array.getArray()[in];
                    array.getArray()[in] = array.getArray()[in + 1];
                    array.getArray()[in + 1] = temp;
                }
            }
        }
    }

    @Override
    public void quickSort(CustomArray array, int low, int high) throws ArrayException {
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        if (low >= high) {
            throw new ArrayException("low >= high");
        }
        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array.getArray()[(int) middle];

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
                int temp = array.getArray()[i];
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

    @Override
    public void shellSort(CustomArray array) throws ArrayException {
        if (array.getArray().length == 0) {
            throw new ArrayException("Array is empty");
        }

        int gap = array.getArray().length / 2;
// Пока разница между элементами есть
        while (gap >= 1) {
            for (int right = 0; right < array.getArray().length; right++) {
                // Смещаем правый указатель, пока не сможем найти такой, что
                // между ним и элементом до него не будет нужного промежутка
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array.getArray()[c] > array.getArray()[c + gap]) {
                        int temp = array.getArray()[c];
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
