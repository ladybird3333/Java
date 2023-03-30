// program liczący pierwiastek n-tego stopnia (gdzie n to dowolna liczba naturalna) ze wskazanej liczby bez użycia funkcji z klasy java.lang.Math

package com.company;

import java.util.Scanner;

public class Root {

    public static final double precision = 1.0e-5;

    public static double Power(double base, double power) {
        double result = 1;
        while (power != 0) {
            result = result * base;
            power--;
        }
        return result;
    }

    public static double Absolute_Value(double value) {
        return (value <= 0.0) ? 0.0 - value : value;
    }

    public static double Calculate_Root(double a, double n) {
        double x = a;

        double z = Power(x, (n - 1));

        do {/* obliczam przybliżenie ze wzoru 1/n((n-1)*x + a/x^(n-1)) */
            x = (1.0 / n) * ((n - 1.0) * x + (a / z));

            z = Power(x, (n - 1));
        }
        /* sprawdzam czy błąd przybliżenia jest wiekszy od ustalonej precyzji |a-x^n|>=precision*/
        while (Absolute_Value((a - z * x)) >= precision);
        return x;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbe pierwiastkowana: ");
        int a = in.nextInt();
        System.out.print("Podaj podstawe pierwiastka: ");
        int b = in.nextInt();

        System.out.println("Pierwiastek " + b + " stopnia z " + a + " wynosi: " + Calculate_Root(a, b));
    }
}
