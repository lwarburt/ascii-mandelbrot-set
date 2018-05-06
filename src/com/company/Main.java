package com.company;

public class Main {

    public static final int ITERATION_NUMBER = 1000;
    public static final int WIDTH = 40;
    public static final int HEIGHT = 30;
    public static final double X_MIN = -2.5;
    public static final double X_MAX = 1;
    public static final double Y_MIN = -1;
    public static final double Y_MAX = 1;

    public static void main(String[] args) {
        double xScale = (X_MAX - X_MIN) / WIDTH;
        double yScale = (Y_MAX - Y_MIN) / HEIGHT;
        Complex z = new Complex(0, 0);
        Complex c = new Complex(0, 0);
        for (int y = 1; y <= HEIGHT; y++) {
            for (int x = 1; x <= WIDTH; x++) {
                c.setB(yScale * y + Y_MIN);
                c.setA(xScale * x + X_MIN);
                if (testPoint(c, z)) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    public static boolean testPoint(Complex c, Complex z) {
        double a = 0;
        double b = 0;
        for (int n = 0; n <= ITERATION_NUMBER && a * a + b * b <= 4; n++) {
            a = z.getA();
            b = z.getB();
            z = c.add(z.square());
            if (a * a + b * b >= 4) {
                return false;
            }
        }
        return true;
    }
}
