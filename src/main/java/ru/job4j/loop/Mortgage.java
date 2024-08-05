package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double credit = amount + amount * percent / 100;
        double balance = credit;
        while (balance > 0) {
            balance = credit - salary;
            credit = balance * percent / 100 + balance;
            year += 1;
        }
        return year;
    }
}
