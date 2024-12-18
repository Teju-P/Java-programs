/*Count no. of vowels and consonants in input string
 * constraints: The string may contain numeric characters, and only lowercase letters are allowed in the input string.
 */

import java.util.Scanner;
public class CountVowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        System.out.println("Input string = "+s);
        int vcount = 0, ccount = 0;
        char c[] = s.toCharArray();
        for(char x:c){
            if(String.valueOf(x).matches("[aeiou]")) vcount++;
            if(String.valueOf(x).matches("[^aeiou0-9!@#$%^&*()-_;:?\\[\\]\\{\\}/]")) ccount++;
        }
        System.out.println("Total no. of vowels = "+vcount);
        System.out.println("Total no. of consonants = "+ccount);
    }
}
