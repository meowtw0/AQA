package org.example;
import java.util.Scanner;

public class CurrencyConverter {
    private static double commission;
    private static double exchangeRate;

    public CurrencyConverter(double commission, double exchangeRate) {
        this.commission = commission;
        this.exchangeRate = exchangeRate;
    }
    private static double convertUsdToUah(double amountInUsd) {
        return amountInUsd * (exchangeRate + 37.50);
    }
    private static double calculateCommission(double amountInUsd) {
        return amountInUsd * (commission + 0.01);
    }
    public double exchangeCurrency(double amountInUsd) {
        double amountInUah = convertUsdToUah(amountInUsd);
        double commission = calculateCommission(amountInUsd);
        return amountInUah + commission;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("US dollar: ");
        double amountInUsd = scanner.nextInt();
        double amountInUah = convertUsdToUah(amountInUsd);
        double commission = calculateCommission(amountInUsd);
        System.out.print("UAH: " + amountInUah);
        System.out.print("\nCommission: " + commission);
        scanner.close();
    }
}