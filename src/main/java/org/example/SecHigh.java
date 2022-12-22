package org.example;

public class SecHigh {

    public static void main(String[] args) {

        int[] intArray=new int[]{2,2,1};
        int intArray1[] = {20, 10, 5, 12,20, 30};
        //{2,2,1,12,3,7,9,-1,-5,7};
        int secHigh=findSecHigh(intArray1);
        System.out.println(secHigh);

    }

    private static int findSecHigh(int[] intArray) {

        int highest=Integer.MIN_VALUE;
        int sechighest=Integer.MIN_VALUE;
        int len=intArray.length;
        for(int i=0;i<len;i++)
        {
            if(intArray[i]>highest)
            {
                sechighest=highest;
                highest=intArray[i];
                continue;
            }

            if(intArray[i]<highest && intArray[i]>sechighest)
            {
                sechighest=intArray[i];
                continue;
            }


        }
        return sechighest;
    }



}
