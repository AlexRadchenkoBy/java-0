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
}