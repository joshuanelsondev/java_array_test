package org.example;

import java.util.ArrayList;

public class FilterStringsByPrefix {

    public static String[] filterStringsByPrefix(String[] arr, String prefix) {
      if (arr == null || prefix == null)  throw new IllegalArgumentException();
      ArrayList<String> filteredStringsArr = new ArrayList<>();
      for (String str : arr) {
          if (str.contains(prefix)) {
              filteredStringsArr.add(str);
          }
      }

      String[] filteredArr = new String[filteredStringsArr.size()];
      for (int i = 0; i < filteredStringsArr.size(); i++) {
          filteredArr[i] = filteredStringsArr.get(i);
      }

      return filteredArr;

    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

    }
}
