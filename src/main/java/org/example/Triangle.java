package org.example;

public class Triangle {
    public static void main(String args [])
    {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int a = rows - i; a > 0; a--) {
                System.out.print(" ");
            }
             for (int b = 1; b <= 2 * i - 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
