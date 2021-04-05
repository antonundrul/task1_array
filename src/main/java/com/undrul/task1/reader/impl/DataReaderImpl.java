package com.undrul.task1.reader.impl;

import com.undrul.task1.exception.ArrayException;
import com.undrul.task1.reader.DataReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;

public class DataReaderImpl implements DataReader {

    static Logger logger = LogManager.getLogger();

    @Override
    public ArrayList<String> readDataFromFile(String path) throws ArrayException {
        logger.info("Method to read data from file started");

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

        logger.info("data from file read");
        return dataFromFile;

    }
}
