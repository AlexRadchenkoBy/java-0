package com.company.function;

public class Helper {
    public double getHexagonSquare(int a) {
        return ((3 * Math.sqrt(3)) / 2) * (a * a);
    }

    public int getNod(int a, int b) {
        int min;
        int nod = 0;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        for (int count = 1; count <= min; count++) {
            if (a % count == 0 && b % count == 0) {
                if (count > nod) {
                    nod = count;
                }
            }
        }
        return nod;
    }

    public boolean areСoprime(int a, int b, int c) {
        return (getNod(a, b) == 1 && getNod(a, c) == 1)
                || (getNod(b, a) == 1 && getNod(b, c) == 1)
                || (getNod(c, a) == 1 && getNod(c, b) == 1);
    }

    public int getSumFactorial(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + getFactorial(array[i]);
        }
        return sum;
    }

    public int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

    public String getRepeatStr(String string, int counter) {
        String result = "";
        for (int i = 0; i < counter - 1; i++) {
            result = result + string;
        }
        return result;
    }

    public double getSquareQuadrangle(int x, int y, int z, int t) {
        double sQuare = 0;
        double pQuare = 0;
    if ((x == y) && (z == t)) {
        sQuare = x * x;
    } else if (x == z && y == t) {
        sQuare = x * y;
    } else if (x != z && y != t && x != y && z != t && x != t && y != z) {
        pQuare = (x + y + z + t) / 2;
        sQuare = Math.sqrt((pQuare - x) * (pQuare - y) * (pQuare - z) * (pQuare - t));
    }
    return sQuare;
    }
}
