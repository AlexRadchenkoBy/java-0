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

    public int[] getTwins(int number) {
        int[] numbers = buildArray(number);
        int[] twins = new int[(2 * number - number) + 1];
        int currentPrime = 0;
        int currentTwinsIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (currentPrime == 0 && isPrime(numbers[i])) {
                currentPrime = numbers[i];
                continue;
            }
            if (isPrime(numbers[i])) {
                if (currentPrime + 2 == numbers[i]) {
                    twins[currentTwinsIndex] = currentPrime;
                    twins[currentTwinsIndex + 1] = numbers[i];
                    currentTwinsIndex += 2;
                    currentPrime = 0;
                } else {
                    currentPrime = numbers[i];
                }
            }
        }
        return cutZeros(twins);
    }

    public int[] buildArray(int number) {
        int[] arrayNumbers = new int[(2 * number - number) + 1];
        for (int i = 0, currentNumber = number; i < arrayNumbers.length; i++, currentNumber++) {
            arrayNumbers[i] = currentNumber;
        }
        return arrayNumbers;
    }

    public boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public int[] cutZeros(int[] array) {
        int currentElementWithoutZero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                currentElementWithoutZero++;
            }
        }
        int[] arrayWithoutZeros = new int[currentElementWithoutZero];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != 0) {
                arrayWithoutZeros[j] = array[i];
                j++;
            }
        }
        return arrayWithoutZeros;
    }
    // - найти количество n-значных чисел для создания массива;
    // - создать массив n-значных чисел;
    // - разбить n-значные числа на цифры и записать в новый массив те которые идут по возрастанию;
    public int[] digitSequence(int numberN) {
        int[] receivedNumbers = new int[(int) (9 * Math.pow(10, numberN - 1))];
        for (int i = 0, number = (int) Math.pow(10, numberN - 1); i < receivedNumbers.length; i++, number++) {
            receivedNumbers[i] = number;
        }
        return lookingForSequence(receivedNumbers);
    }

    public int[] lookingForSequence(int[] arraySequence) {
        int[] increasingNumbers = new int[arraySequence.length];
        for (int i = 0; i < arraySequence.length; i++) {
            if (isIncreasing(arraySequence[i])) {
                increasingNumbers[i] = arraySequence[i];
            }
        }
        return cutZeros(increasingNumbers);
    }

    public boolean isIncreasing(int number) {
        int[] digits = getArrayOfNumbers(number);
        boolean isIncreasing = true;
        for (int j = 0; j < digits.length - 1; j++) {
            if (digits[j] <= digits[j + 1]) {
                isIncreasing = false;
                break;
            }
        }
        return isIncreasing;
    }
    // - ввести любое целое число( желательно двузначное и больше);
    // - разложить число на цифры;
    // - записать получившийся результат в массив;
    // - сложить полученные цифры числа и сохранить результат;
    // - из результата вычетать полученную сумму его цифр пока не получим нуль.
    // - посчитать количество таких операций;
     public int amountOfDeductions(int number) {
        int counterDeduction = 0;
        for (int i = number; number > 0; i++) {
            int sumDigits = getSumDigits(number);
            number = number - sumDigits;
            counterDeduction++;
        }
        return counterDeduction;
    }

    public int getSumDigits( int number) {
        int sumDigits = 0;
        int[]digits = Numberdigits(number);
        for (int i = 0; i < digits.length; i++) {
            sumDigits = sumDigits + digits[i];
        }
        return sumDigits;
    }

    public int getNumberlenth(int number) {
        int numberlenth = calcDigits(number);
        return numberlenth;
    }

    public int[] Numberdigits(int number) {
        int[] numberlenth = getArrayOfNumbers(number);
        return numberlenth;
    }
}


