package org.example;

import java.util.ArrayList;

public class FilterEvenNumbers {

    public static int[] filterEvenNumbersFunc(int[] arr) {
        if (arr == null) throw new IllegalArgumentException();
        ArrayList<Integer> evenNums = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) evenNums.add(num);
        }
        
        int[] filteredArr = new int[evenNums.size()];
        for (int i = 0; i < evenNums.size(); i++) {
           filteredArr[i]  = evenNums.get(i);
        }
        
        return filteredArr;
    }


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }

}



