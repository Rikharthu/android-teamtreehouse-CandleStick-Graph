package com.teamtreehouse.customviewsbase;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class CSVParser {


    static List<StockData> read(InputStream inputStream){
        List<StockData> resultList = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String csvLine;
            while ((csvLine = reader.readLine()) != null) {
                csvLine = csvLine.replace("\"", "");
                String[] row = csvLine.split(",");

                String date = row[0];
                float close = Float.parseFloat(row[1]);
                float volume = Float.parseFloat(row[2]);
                float open = Float.parseFloat(row[3]);
                float high = Float.parseFloat(row[4]);
                float low = Float.parseFloat(row[5]);
                resultList.add(new StockData(date, close, volume, open, high, low));
            }
        } catch (IOException ex) {
            throw new RuntimeException("Error in reading CSV file: "+ex);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException("Error while closing input stream: "+e);
            }
        }
        return resultList;
    }
}