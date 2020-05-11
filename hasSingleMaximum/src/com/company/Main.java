package com.company;

public class Main {

    public static void main(String[] args) {
        int[] test = null;
        System.out.println(hasSingleMaximum(test));
    }

    public static int hasSingleMaximum(int[] a) {
        if (a == null || a.length == 0) {
            return 0;
        }

        int currentMax = 0;
        int maxCount = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > currentMax) {
                currentMax = a[i];
                maxCount = 1;
            } else {
                if (a[i] == currentMax) {
                    maxCount++;
                }
            }
        }

        return maxCount == 1 ? 1 : 0;

    }
}
