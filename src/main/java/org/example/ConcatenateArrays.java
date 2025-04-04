package org.example;


public class ConcatenateArrays {

    public static int[] concatenateArraysFunc(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) throw new IllegalArgumentException("Arguments can not be null");
        int[] concatenatedArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, concatenatedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, concatenatedArr, arr1.length, arr2.length);
        return concatenatedArr;
    }


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }

}
