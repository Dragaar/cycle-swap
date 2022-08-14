package com.epam.rd.autotasks;

import java.util.Arrays;
import java.lang.Object;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if( array == null || array.length == 0) return;

            int temp = array[array.length - 1];

            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = temp;

    }



    static void cycleSwap(int[] array, int shift) {

        if( array == null || array.length == 0) return;

            int[] temp = Arrays.copyOf(array, (array.length - shift));
            int[] temp2 = Arrays.copyOfRange(array, (array.length - shift), array.length);
            for (int i = 0; i < temp.length; i++) {
                array[i+shift] = temp[i];
            }
            for (int i = 0; i < temp2.length; i++) {
                array[i] = temp2[i];
            }

    }

    //https://www.baeldung.com/java-concatenate-arrays
/*
    static <T> T[] joinArrayGeneric(T[]... arrays) {
        int length = 0;
        for (T[] array : arrays) {
            length += array.length;
        }*/
}
