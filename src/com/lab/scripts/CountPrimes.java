package com.lab.scripts;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 * 
 * @author Mikita_Saladkevich
 *
 */
public class CountPrimes {

    public static int countPrimesTrue(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        
        return count;
    }
    
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
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
    
    }

}
