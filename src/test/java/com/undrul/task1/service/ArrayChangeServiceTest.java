package com.undrul.task1.service;

import com.undrul.task1.entity.CustomArray;
import com.undrul.task1.exception.ArrayException;
import com.undrul.task1.service.impl.ArrayChangeServiceImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayChangeServiceTest {

    ArrayChangeServiceImpl arrayChangeService = new ArrayChangeServiceImpl();

    @Test
    public void elementReplacementTest() throws ArrayException {
        CustomArray testArray = new CustomArray(new int[]{8, 3, 5, -4, -9, 0});
        int[] expectedArray = new int[]{40, 3, 5, -20, -9, 0};
        arrayChangeService.elementReplacement(testArray);
        int[] actual = testArray.getArray();
        Assert.assertEquals(actual, expectedArray);
    }
}
