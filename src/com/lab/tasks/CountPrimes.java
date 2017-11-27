package com.lab.tasks;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 * 
 * @author Mikita_Saladkevich
 *
 */
public class CountPrimes {
    
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
           if (num % i == 0) return false;
        }
        return true;
     }

    public static int countPrimes(int n) {
        int primes = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                primes++;
            }
        }
        return primes;
    }

    public static void main(String[] args) {    
        System.out.println(countPrimes(50));        
    }

}
