package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 20));

    }
    public static int hasNValues(int[] a, int n) {

        if (a==null || a.length == 0 || n == 0)
            return 0;
         int size = 0;
        Set<Integer> newsize = new HashSet<>();

        for (int i = 0; i < a.length; i++) {

            if (!newsize.contains(a[i])) {
                newsize.add(a[i]);
                size++;
            }
        }
        return size == n ? 1 : 0;
    }

}

