package org.example;
import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            int commonDenominator = this.denominator * other.denominator;
            int thisNumerator = this.numerator * other.denominator;
            int otherNumerator = other.numerator * this.denominator;
            return thisNumerator == otherNumerator && commonDenominator == this.denominator * other.denominator;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВведіть чисельник та знаменник: ");
        Fraction fraction1 = readFractionFromInput(scanner);
        System.out.println("ВВведіть чисельник та знаменник: ");
        Fraction fraction2 = readFractionFromInput(scanner);
        boolean result = fraction1.equals(fraction2);
        System.out.println("Вивід: " + result);
    }
    private static Fraction readFractionFromInput(Scanner scanner) {
        System.out.print("Введіть чисельник: ");
        int numerator = scanner.nextInt();
        System.out.print("Введіть знаменник: ");
        int denominator = scanner.nextInt();
        return new Fraction(numerator, denominator);
    }
}
