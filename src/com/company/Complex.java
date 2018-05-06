package com.company;

public class Complex {
    private double a;
    private double b;

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complex add(Complex h) {
        Complex sum = new Complex(0, 0);
        sum.a = this.a + h.getA();
        sum.b = this.b + h.getB();
        return sum;
    }

    public Complex subtract(Complex h) {
        Complex difference = new Complex(0, 0);
        difference.a = this.a - h.getA();
        difference.b = this.b - h.getA();
        return difference;
    }

    public Complex square() {
        return new Complex((a * a) - (b * b), 2 * a * b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}