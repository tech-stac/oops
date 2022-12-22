package com.cvent;

import java.util.Arrays;
import java.util.Objects;

public class ArraysProblem {

    public static void main(String[] args) {
       /* int[] l1 = {2, 4, 3};
        int[] l2 = {5, 6, 4};
*/
        int[] l1 = {0};
        int[] l2 = {0};


      //  output = []
        Integer[] arr = arraysAdd(l1,l2);
        System.out.println(" Arrays reverse " + Arrays.toString(arr));
       // System.out.println(" Arrays reverse " + Arrays.toString(reverse(arr)));
    }

    public static Integer[] arraysAdd(int[] l1, int[] l2) {

            int getLength = l1.length < l2.length ? l1.length : l2.length;
            Integer[] sumOfArray = new Integer[getLength];
            Integer firstCarry = 0;
            String str1 = "";
            Integer carryLeft = 0;
            char[] c = null;

        for (int i = 0; i < getLength; i++) {

            if (carryLeft.equals(1)) {
                sumOfArray[i] = l1[i] + l2[i] + carryLeft;
            }
            else {
                sumOfArray[i] = l1[i] + l2[i];

                if (sumOfArray.length > getLength) {

                    if (Objects.equals(sumOfArray[1], sumOfArray[i])) {
                        firstCarry = l1[i] + l2[i];
                        str1 = Integer.toString(firstCarry);
                        c = str1.toCharArray();
                        for (char c1 : c) {
                            firstCarry = Integer.valueOf(String.valueOf(c1));
                            if (carryLeft.equals(0)) {
                                carryLeft = firstCarry;
                            }
                        }
                        sumOfArray[i] = firstCarry;
                        firstCarry = null;
                    }
                }
            }
        }
        return sumOfArray;
    }
}



