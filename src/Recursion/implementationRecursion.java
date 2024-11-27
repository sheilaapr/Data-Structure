/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author Sheila
 */
public class implementationRecursion {

    public static double eksponensial(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static int deretBilangan(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        
        int prev1 = 0, prev2 = 1;
        int result = 1;
        
        for (int i = 2; i <= n; i++) {
            result = prev1 + prev2;
            prev1 = prev2;
            prev2 = result;
        }
        return result;
    }

    public static int faktorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        System.out.println("Eksponensial: " + base + "^" + exponent + " = " + eksponensial(base, exponent));

        int n = 5;
        System.out.println("Deret Bilangan dari 1-" + n + " = " + deretBilangan(n));

        int fib = 6;
        System.out.println("Fibonacci ke-" + fib + " = " + fibonacci(fib));

        int fact = 4;
        System.out.println("Faktorial dari " + fact + " = " + faktorial(fact));
    }
}
