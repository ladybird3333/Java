package com.company;

public class Function3 extends AbstractFunction {

    double f(double x)
    {
        return (Math.sin(x)*x*x);
    }


    public static void main(String[] args) {
        Function3 f=new Function3();
        AbstractFunction.precision=1.0e-5;
        System.out.println("\nFunction: sin(x)*x^2\n");
        System.out.println("\n ***Calculating the root of an equation on the interval [2,4] - Bisection method***");
        System.out.println(f.getRootBisection(2,4 ));
        System.out.println("\n ***Calculation of the definite integral on the interval [1,2] when divided into 3 figures - Trapezoidal method: ***");
        System.out.println(f.trapezoidal(1, 2, 2));
        System.out.println("\n ***Calculating the root of an equation on the interval [2,4] - Secant method ***");
        System.out.println(f.Secant_Method(2, 4));
    }
}
