package ru.job4j.calculator;

public class Fit {
    public static double calculateManWeight(double height) {
         double result = (height - 100) * 1.15;
         return result;
    }

    public static double calculateWomanWeight(double height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        double height = 180;
        double man = Fit.calculateManWeight(height);
        double woman = Fit.calculateWomanWeight(height);
        System.out.println("Woman 187 is " + woman);
        System.out.println("Man 187 is " + man);
    }
}