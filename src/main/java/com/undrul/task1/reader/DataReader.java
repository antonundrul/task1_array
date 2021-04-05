package com.undrul.task1.reader;

import com.undrul.task1.exception.ArrayException;

import java.util.ArrayList;

public interface DataReader {
    ArrayList<String> readDataFromFile(String path) throws ArrayException;
}
