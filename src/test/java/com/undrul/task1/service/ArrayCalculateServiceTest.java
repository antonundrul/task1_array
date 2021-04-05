package com.undrul.task1.service;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;
import com.undrul.task1.service.impl.ArrayCalculateServiceImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayCalculateServiceTest {
    ArrayCalculateServiceImpl arrayCalculateService = new ArrayCalculateServiceImpl();

    @Test
    public void calculateAverageValueTest() throws ArrayException {
        CustomArray testArray = new CustomArray(new int[]{8, 3, 5, -4, -9, 0});
        double actualAverage= arrayCalculateService.calculateAverageValue(testArray);
        Assert.assertEquals(actualAverage, 0.5);
    }

    @Test
    public void calculateAverageValueStreamTest() throws ArrayException {
        CustomArray testArray = new CustomArray(new int[]{8, 3, 5, -4, -9, 0});
        double actualAverage= arrayCalculateService.calculateAverageValueStream(testArray);
        Assert.assertEquals(actualAverage, 0.5);
    }

    @Test
    public void calculateSumTest() throws ArrayException {
        CustomArray testArray = new CustomArray(new int[]{8, 3, 5, -4, -9, 0});
        int actualSum= arrayCalculateService.calculateSum(testArray);
        Assert.assertEquals(actualSum, 3);
    }

    @Test
    public void calculateSumStreamTest() throws ArrayException {
        CustomArray testArray = new CustomArray(new int[]{8, 3, 5, -4, -9, 0});
        int actualSum= arrayCalculateService.calculateSumStream(testArray);
        Assert.assertEquals(actualSum, 3);
    }

    @Test
    public void countNegativeElementsTest() throws ArrayException {
        CustomArray testArray = new CustomArray(new int[]{8, 3, 5, -4, -9, 0});
        int actualNegative= arrayCalculateService.countNegativeElements(testArray);
        Assert.assertEquals(actualNegative, 2);
    }

    @Test
    public void countNegativeElementsStreamTest() throws ArrayException {
        CustomArray testArray = new CustomArray(new int[]{8, 3, 5, -4, -9, 0});
        int actualNegative= arrayCalculateService.countNegativeElementsStream(testArray);
        Assert.assertEquals(actualNegative, 2);
    }

    @Test
    public void countPositiveElementsTest() throws ArrayException {
        CustomArray testArray = new CustomArray(new int[]{8, 3, 5, -4, -9, 0});
        int actualPositive= arrayCalculateService.countPositiveElements(testArray);
        Assert.assertEquals(actualPositive, 3);
    }

    @Test
    public void countPositiveElementsStreamTest() throws ArrayException {
        CustomArray testArray = new CustomArray(new int[]{8, 3, 5, -4, -9, 0});
        int actualPositive= arrayCalculateService.countPositiveElementsStream(testArray);
        Assert.assertEquals(actualPositive, 3);
    }
}
