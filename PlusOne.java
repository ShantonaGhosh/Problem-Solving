package com.mycompany.plusone;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOneData(int[] digit) {
        for (int i = digit.length - 1; i >= 0; i--) {
            if (digit[i] == 9) {
                digit[i] = 0;
            } else {
                digit[i]++;
                return digit;
            }
        }
        digit = new int[digit.length + 1];
        digit[0] = 1;
        return digit;
    }

    public static void main(String[] args) {
        int[] digit = {1, 2, 9};
        System.out.println("output : " + Arrays.toString(plusOneData(digit)));
    }
}
