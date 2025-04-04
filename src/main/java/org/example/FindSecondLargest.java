package org.example;

public class FindSecondLargest {

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2 || areElementsSame(arr)) throw new IllegalArgumentException();
        int largestNum = arr[0];
        int secondLargestNum = arr[1];
        for (int num : arr) {
            if (num > secondLargestNum && num < largestNum) {
                secondLargestNum = num;
            }
            if (num > largestNum) {
                secondLargestNum = largestNum;
                largestNum = num;
            }
        }
        return secondLargestNum;
    }

    public static boolean areElementsSame(int[] arr) {
        int firstEle = arr[0];
        for (int num : arr) {
            if (firstEle != num) {
                return false;
            }
        }
        return true;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }

}
