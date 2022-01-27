package com.company.function;

public class Function {

    public static void main(String[] args) {
        Helper helper = new Helper();
        int[] array = {1, 3, 5, 7, 9};
        double square = helper.getHexagonSquare(4);
        System.out.println(square);

        int a = (int) (Math.random() * (20 - 1) + 1);
        int b = (int) (Math.random() * (20 - 1) + 1);
        int c = (int) (Math.random() * (20 - 1) + 1);
        boolean coprime = helper.areСoprime(25, 5, 3);
        System.out.println(coprime);

        int Nod = helper.getNod(25, 14);
        System.out.println(Nod);

        int sumFactorial = helper.getSumFactorial(array);
        System.out.println(sumFactorial);

        System.out.println(helper.getFactorial(3));

        String repeatStr = helper.getRepeatStr("Hello", 5);
        System.out.print(repeatStr);
        System.out.println();

        double squareQuadrangle = helper.getSquareQuadrangle(4, 4, 5, 5);
        System.out.println(squareQuadrangle);


        int[] arrayOfNumber = helper.getArrayOfNumbers(456);
        for (int i = 0; i < arrayOfNumber.length; i++) {
            System.out.print(arrayOfNumber[i] + " ");
        }
        System.out.println();

        int wereMoreNumber = helper.isFirstNumberMore(13454, 1245673);
        System.out.println(wereMoreNumber);

        int[] twins = helper.getTwins(5);
        for (int i = 0; i < twins.length; i++) {
            System.out.print(twins[i] + " ");
        }
        System.out.println();

        int[] r = helper.digitSequence(2);
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + " ");
        }
        System.out.println();

        int k = helper.amountOfDeductions(123);
                System.out.print(k + " ");
                System.out.println();

        String transformer = helper.transformation("перевести в заглавные буквы");
            System.out.print(transformer + " ");
            System.out.println();

            String rps = helper.rps("paper", "rock");
            System.out.print(rps);
            System.out.println();


            String sentenceOfWord = helper.toSentenceOfWords(new String[] {"Hello", "world", "this", "is", "great"});
            System.out.print(sentenceOfWord + " ");
            System.out.println();

            int quater = helper.showQuarter(11);
            System.out.println(quater);

            helper.readingFile(" ");
    }

}