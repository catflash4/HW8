import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] numbers = new int[]{1,2,3};

        double[] fractNumbers = new double[]{1.57,7.654,9.986};

        int[] numbersTwo = new int[]{3,4,5,6,7,8,9,10};

        //Задача 2
        System.out.println(Arrays.toString(numbers).replace("[","").replace("]",""));
        System.out.println(Arrays.toString(fractNumbers).replace("[","").replace("]",""));
        System.out.println(Arrays.toString(numbersTwo).replace("[","").replace("]",""));
        //Задача 3
        for (int i = numbers.length; i > 0; i--) {
            if (i - 1 == 0 ) {
                System.out.print(numbers[i-1]);
            } else {
                System.out.print(numbers[i-1] + ", ");
            }
        }
        System.out.println();
        for (int i = fractNumbers.length; i > 0; i--) {
            if (i - 1 == 0 ) {
                System.out.print(fractNumbers[i-1]);
            } else {
                System.out.print(fractNumbers[i-1] + ", ");
            }
        }
        System.out.println();
        for (int i = numbersTwo.length; i > 0; i--) {
            if (i - 1 == 0 ) {
                System.out.print(numbersTwo[i-1]);
            } else {
                System.out.print(numbersTwo[i-1] + ", ");
            }
        }
        //Задача 4
        System.out.println();
        for (int i = 0; i < numbersTwo.length; i++ ) {
            if (numbersTwo[i] % 2 != 0) {
                numbersTwo[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbersTwo).replace("[","").replace("]",""));
    }
}