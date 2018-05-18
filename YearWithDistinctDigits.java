package Assignment3;

import java.util.Scanner;

public class YearWithDistinctDigits {

    public static void main(String[] args) {

        System.out.println("input year");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int year = Integer.valueOf(str);
        year += 1;

        for (int i = year; i < 10000; i++) {
            String nextYear = String.valueOf(year);
            char[] yearArray = nextYear.toCharArray();
            if (distinctValues(yearArray)) {
                break;
            } else {
                year++;
            }
        }
        System.out.println(year);
    }

    public static boolean distinctValues(char[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }



  // 1  9   8   7
  // i i+1 i+2 i+3


}
