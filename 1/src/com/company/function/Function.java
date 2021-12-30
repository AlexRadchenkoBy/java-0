package com.company.function;

public class Function {

    public static void main(String[] args) {
        Function functionClass = new Function();
        functionClass.getArr(1, 2);
        functionClass.getArr(4, 5);
    }


    private int[] getArr(int a, int b) {
        return new int[] {a, b};
    }

    private void getArr2(int a, int b) {
    }

}