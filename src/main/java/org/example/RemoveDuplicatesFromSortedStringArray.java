package org.example;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedStringArray {

    public static String[] removeDuplicatesFromSortedStringArray(String[] arr) {
        if (arr == null) throw new IllegalArgumentException();
        ArrayList<String> uniqueStrArr = new ArrayList<>();
        for (String str : arr) {
            if (!uniqueStrArr.contains(str)) {
                uniqueStrArr.add(str);
            }
        }

        String[] uniqueStrings = new String[uniqueStrArr.size()];
        int i = 0;
        for (String str : uniqueStrArr) {
           uniqueStrings[i++]  = str;
        }

       return uniqueStrings;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
