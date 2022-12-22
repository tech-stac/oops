package com.onePrintinRightAngledTriangle;

public class RightAlignedTriangle {

/*
      1
     11
    111
   1111
  11111
 111111
1111111
    */


    public static void printRightAlignedTriangle(int lengthOfRow) {

        for (int i = 0; i <= lengthOfRow; i = i + 1) {
                for (int j = 0; j < lengthOfRow - i; ++j) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; ++j) {
                    System.out.print("1");
                }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printRightAlignedTriangle(7);
    }

}