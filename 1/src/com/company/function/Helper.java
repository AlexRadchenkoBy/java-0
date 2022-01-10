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
        double semiPerimeter = (x + y + z + t) / 2;
        return  Math.sqrt((semiPerimeter - x) * (semiPerimeter - y) * (semiPerimeter - z) * (semiPerimeter - t));
    }

    public int[] getArrayOfNumbers(int numberN) {
        int[] digits = new int[calcDigits(numberN)];
        for (int i = numberN, j = 0; i != 0; i = i / 10, j++) {
            digits[j] = i % 10;
        }
        return digits;
    }

    public int isFirstNumberMore(int number1, int number2) {
        int comparisonCode = 0;
        int amountOfDigitsNumberOne = calcDigits(number1);
        int amountOfDigitsNumberTwo = calcDigits(number2);

        if (amountOfDigitsNumberOne > amountOfDigitsNumberTwo) {
             comparisonCode = 1;
        } else if (amountOfDigitsNumberOne < amountOfDigitsNumberTwo) {
            comparisonCode = -1;
        }
        return comparisonCode;
    }

    public int calcDigits(int number) {
        int amountOfDigits = 0;
        for (int i = number; i != 0; i /= 10) {
            amountOfDigits++;
        }
        return amountOfDigits;
    }

    public int[] getArrayNumbers(int number) {
        int[] arrayNumbers = new int[(2 * number - number) + 1];
        for (int i = 0, currentNumber = number; i < arrayNumbers.length; i++, currentNumber++) {
            arrayNumbers[i] = currentNumber;
            System.out.println(arrayNumbers[i]);
        }

        return arrayNumbers;
    }

    public int[] getArrayTwinNumbers(int number) {
        int[] arrayNumbersTwin = new int[(2 * number - number) + 1];
        for (int i = 0; i < arrayNumbersTwin.length; i++) {
            arrayNumbersTwin[0] = getArrayNumbers(number)[i];
            arrayNumbersTwin[1] = getArrayNumbers(number)[i + 2];
        }
        return arrayNumbersTwin;
    }
}
