import java.util.Scanner;

public class PrintASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char c = sc.next().charAt(0);
        System.out.println("Character entered is "+c);
        System.out.println("ASCII value of "+c+" is "+(int)c);
    }
}
