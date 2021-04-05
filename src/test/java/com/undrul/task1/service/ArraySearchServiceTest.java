package com.undrul.task1.service;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;
import com.undrul.task1.service.impl.ArraySearchServiceImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySearchServiceTest {
    ArraySearchServiceImpl arraySearchServiceImpl = new ArraySearchServiceImpl();

    @Test
    public void searchMinTest() throws ArrayException  {
        CustomArray testArray = new CustomArray(new int[]{8, 3, 5, -4, -9, 0});
        int actualMin= arraySearchServiceImpl.searchMin(testArray);
        Assert.assertEquals(actualMin, -9);
    }

    @Test
    public void searchMaxTest() throws ArrayException {
        CustomArray testArray = new CustomArray(new int[]{8, 3, 5, -4, -9, 0});
        int actualMax= arraySearchServiceImpl.searchMax(testArray);
        Assert.assertEquals(actualMax, 8);
    }

    @Test
    public void findMinElementStreamTest() throws ArrayException  {
        CustomArray testArray = new CustomArray(new int[]{8, 3, 5, -4, -9, 0});
        int actualMin= arraySearchServiceImpl.findMinElementStream(testArray);
        Assert.assertEquals(actualMin, -9);
    }

    @Test
    public void findMaxElementStreamTest() throws ArrayException {
        CustomArray testArray = new CustomArray(new int[]{8, 3, 5, -4, -9, 0});
        int actualMax= arraySearchServiceImpl.findMaxElementStream(testArray);
        Assert.assertEquals(actualMax, 8);
    }

}
