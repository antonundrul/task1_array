package com.undrul.task1.reader.impl;

import com.undrul.task1.exception.ArrayException;
import com.undrul.task1.reader.DataReader;

import java.io.*;
import java.util.ArrayList;

public class DataReaderImpl implements DataReader {

    @Override
    public ArrayList<String> readDataFromFile(String path) throws ArrayException {
        ArrayList<String> dataFromFile = new ArrayList<>();


        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            
            dataFromFile.add(line);
            while (bufferedReader.ready()) {
                line = bufferedReader.readLine();
                dataFromFile.add(line);
            }
        }catch (Exception e){
            throw new ArrayException("File is not found", e);
        }

        return dataFromFile;

    }
}
