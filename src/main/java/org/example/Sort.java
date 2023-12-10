package org.example;

public class Sort {
    public static void main(String args [])
    {
        int[] array = {89,18,64,28,29,66,52,46,70,27};
        int a=array.length;
        for (int i = 0; i < a - 1; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
