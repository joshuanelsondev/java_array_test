package org.example;

public class FindMax {

    public static int findMax(int[] arr) {
        int maxNum = arr[0];
        for (int num : arr) {
            maxNum = Math.max(maxNum, num);
        }

        return maxNum;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
