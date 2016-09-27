package com.interview.other;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    private PrimeNumber primeNumber = new PrimeNumber();

    @Test
    public void there_number_shoud_be_prime_number() {
        assertEquals(true, primeNumber.isPrime(2));
        assertEquals(true, primeNumber.isPrime(3));
        assertEquals(true, primeNumber.isPrime(5));
        assertEquals(true, primeNumber.isPrime(7));
        assertEquals(true, primeNumber.isPrime(11));
        assertEquals(true, primeNumber.isPrime(13));
        assertEquals(true, primeNumber.isPrime(17));
    }
    @Test
    public void there_number_shoud_not_be_prime_number() {
        assertEquals(false, primeNumber.isPrime(4));
        assertEquals(false, primeNumber.isPrime(6));
        assertEquals(false, primeNumber.isPrime(8));
        assertEquals(false, primeNumber.isPrime(9));
        assertEquals(false, primeNumber.isPrime(10));
        assertEquals(false, primeNumber.isPrime(12));
        assertEquals(false, primeNumber.isPrime(16));
    }

}
