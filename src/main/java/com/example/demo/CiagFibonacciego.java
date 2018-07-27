package com.example.demo;
public class CiagFibonacciego {

    public int fibonacciCalculator(int max) {

        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        int sum = 0;
        int nextSum = 0;


        while (nextSum < max) {

            if (num3 % 2 == 0) {
                nextSum += num3;
            }
            if (nextSum < max) {
                sum = nextSum;
            }

            num3 = num1 + num2;

            num1 = num2;
            num2 = num3;
        }
        return sum;
    }
}
