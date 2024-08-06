package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double balance = amount + amount * percent / 100 - salary;
        while (balance > 0) {
            balance = balance * percent / 100 + (balance - salary);
            year += 1;
        }
        return year;
    }
}
