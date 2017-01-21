package com.teamtreehouse.customviewsbase;

class StockData {
    String date;
    float close;
    float volume;
    float open;
    float high;
    float low;

    StockData(String date, float close, float volume, float open, float high, float low) {
        this.date = date;
        this.close = close;
        this.volume = volume;
        this.open = open;
        this.high = high;
        this.low = low;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", " +
                "Close: " + close + ", " +
                "Volume: " + volume + ", " +
                "Open: " + open + ", " +
                "High: " + high + ", " +
                "Low: " + low;
    }
}