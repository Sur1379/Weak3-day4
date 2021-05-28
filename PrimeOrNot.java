package com.company.Weak3Day4;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = num / 2;
        if(determinePrime(num, i) == true){
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }
    }

    public static boolean determinePrime(int num, int i) {
        if (num % i == 0) {
            return false;
        } else if (i == 2) {
            return true;
        }
        return determinePrime(num, i - 1);
    }
}
