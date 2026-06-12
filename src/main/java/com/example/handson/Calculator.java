
package com.example.handson;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        if (a < 0 || b > 10 || c > 10) {
            throw new IllegalArgumentException();
        }
        return a + b + c;
    }
}
