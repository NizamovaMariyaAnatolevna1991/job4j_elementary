package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
         double result = (height - 100) * 1.15;
         return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 187 is " + woman);
        System.out.println("Man 187 is " + man);
    }
}