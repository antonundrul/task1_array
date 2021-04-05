package com.undrul.task1.service;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;
import com.undrul.task1.service.impl.ArraySortServiceServiceImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySortServiceTest {
    ArraySortServiceServiceImpl arraySortServiceImpl = new ArraySortServiceServiceImpl();

    @Test
    public void bubbleSortTest() throws ArrayException {
        CustomArray arrayForSort = new CustomArray(new int[]{8, 3, 5, -4, -9, 0});
        int[] expectedArray = new int[]{-9, -4, 0, 3, 5, 8};
        arraySortServiceImpl.bubbleSort(arrayForSort);
        int[] actual = arrayForSort.getArray();
        Assert.assertEquals(actual, expectedArray);
    }

    @Test
    public void shellSortTest() throws ArrayException {
        CustomArray arrayForSort = new CustomArray(new int[]{8, 3, 5, -4, -9, 0});
        int[] expectedArray = new int[]{-9, -4, 0, 3, 5, 8};
        arraySortServiceImpl.shellSort(arrayForSort);
        int[] actual = arrayForSort.getArray();
        Assert.assertEquals(actual, expectedArray);
    }

    @Test
    public void quickSortTest() throws ArrayException {
        CustomArray arrayForSort = new CustomArray(new int[]{8, 3, 5, -4, -9, 0});
        int[] expectedArray = new int[]{-9, -4, 0, 3, 5, 8};
        arraySortServiceImpl.quickSort(arrayForSort, 0, arrayForSort.getArray().length-1);
        int[] actual = arrayForSort.getArray();
        Assert.assertEquals(actual, expectedArray);
    }
}
