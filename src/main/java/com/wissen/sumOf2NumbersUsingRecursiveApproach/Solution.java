package com.wissen.sumOf2NumbersUsingRecursiveApproach;

public class Solution {

        public static  int getSum(int a, int b) {

            while(b != 0){
                var carry = a & b;
                a ^= b;
                b = carry << 1;
            }

            return a;

        }


    public static void main(String[] args) {
         int sum = getSum(3,10);
        System.out.println(sum);
          }
    }






