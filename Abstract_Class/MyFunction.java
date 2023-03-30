package com.company;

public class MyFunction extends AbstractFunction {

    double f(double x) {
        return (x * x * x + x - 1);
    }


    public static void main(String[] args) {
        MyFunction f = new MyFunction();
        AbstractFunction.precision=1.0e-5;
        System.out.println("\nFunkcja x^3+x-1\n");
        System.out.println("\n ***Calculating the root of equation on the interval [0,1] - Bisection Method ***");
        System.out.println(f.getRootBisection(0, 1));
        System.out.println("\n ***Calculation of the definite integral on the interval [1,2] when divided into 3 figures - Trapezoidal Method: ***");
        System.out.println(f.trapezoidal(1, 2, 3));
        System.out.println("\n ***Calculating the root of equation on the interval [0,1] - Secant Method ***");
        System.out.println(f.Secant_Method(0, 1));
    }
}
