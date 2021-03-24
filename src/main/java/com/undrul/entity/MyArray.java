package com.undrul.entity;

public class MyArray {
    private int size;
    private double[] arr;

    public MyArray() {
    }

    public MyArray(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double[] getArr() {
        return arr;
    }

    public void setArr(double[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }
}
