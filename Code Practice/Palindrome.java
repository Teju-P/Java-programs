import java.util.Scanner;
import java.lang.StringBuffer;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word/number: ");
        String s = sc.next();
        System.out.println("You entered: "+s);
        StringBuffer sb = new StringBuffer(s);
        //System.out.println(sb);
        sb.reverse();
        if(s.equals(sb.toString())) System.out.println(s+" is a palindrome.");
        else System.out.println(s+" is not a palindrome");
    }
}
