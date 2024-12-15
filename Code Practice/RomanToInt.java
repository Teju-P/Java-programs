/*
 If previous char is smaller than curent char, then do  (previous char value - current char value).
 Take, MCMXCIV - Iterate from right to left
  V => 5
  IV => 1<5 => 5-1 = 4
  CIV => 100<1 => 4+100 = 104
  XCIV => 10<100 => 104-10 = 94
  MXCIV => 1000<10 => 94+1000 = 1094
  CMXCIV => 100<1000 => 1094-100 = 994
  MCMXCIV => 1000<100 => 994+1000 => 1994.
 */

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInt {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> rm = new HashMap<>();
        rm.put('I',1);
        rm.put('V',5);
        rm.put('X',10);
        rm.put('L',50);
        rm.put('C',100);
        rm.put('D',500);
        rm.put('M',1000);
        int total = 0;
        int prevVal = 0;
        for(int i=s.length()-1;i>=0;i--){
            int cv = rm.get(s.charAt(i));
            if(cv < prevVal){
                total -= cv;
            }
            else{
                total += cv;
            }
            prevVal = cv;
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman number: "); //MCMXCIV
        String s = sc.next();
        int res = romanToInt(s);
        System.out.println(s+" = "+res);
    }
}
