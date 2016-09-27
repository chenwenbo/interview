package com.interview.other;

/**
 * Created by Administrator on 2016/9/27.
 */
public class PrimeNumber {
    public boolean isPrime(int number) {
        if (number % 2 == 0 && number != 2) {
            return false;
        }
        for (int i = 3; i*i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
