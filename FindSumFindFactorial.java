package com.company.Weak3Day4;

public class FindSumFindFactorial {
    public static void main(String[] args) {
        int[] array = {2, 7, 40, 5, 2, 6};
        int i = array.length - 1;
        int N = 6;
        System.out.println(calculateSum(array, i));
        System.out.println(calculateFactorial(N));

    }

    public static int calculateSum(int[] array, int i) {
        if (i == 0) {
            return array[i];
        }
        return array[i] + calculateSum(array, i - 1);

    }

    public static int calculateFactorial(int N) {
        if (N == 1) {
            return 1;
        }
        return N * calculateFactorial(N - 1);
    }
}
