import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine().toLowerCase();
        System.out.println("s = "+s);
        char [] c = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(char x:c){
            if(x>='a'&&x<='z'){
                sb.append(x);
            }
            else continue;
        }
        s=sb.toString();
        sb.reverse();
        System.out.println("sb = "+sb);
        if(sb.toString().equals(s)) System.out.println(s+" is palindrome");
        else System.out.println(s+" is not palindrome");
    }
}
