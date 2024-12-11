import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("String is : "+s);
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println("Reversed string is: "+sb);
    }
}
