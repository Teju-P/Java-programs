import java.util.Scanner;

public class ScannerClassDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter boolean: ");
        boolean bool = sc.nextBoolean();
        System.out.println("Boolean: "+bool);

        System.out.print("Enter byte: ");
        byte b = sc.nextByte();
        System.out.println("Byte: "+ b);

        System.out.print("Enter short: ");
        short sh = sc.nextShort();
        System.out.println("Short: "+sh);

        System.out.print("Enter char: ");
        //char c = sc.next(); No scanner for character.
        //To implement char, do this:
        String ch = sc.next(); //next() accepts the 1st word that user enters.
        System.out.print("String next(): "+ch);
        char c = ch.charAt(0); // c has the 1st char user entered.
        System.out.println("Char: "+c);

        System.out.print("Enter int: ");
        int i =sc.nextInt();
        System.out.println("Integer: "+i);

        System.out.print("Enter long: ");
        long l = sc.nextLong();
        System.out.println("Long: "+l);

        System.out.print("Enter float: ");
        float f = sc.nextFloat();
        System.out.println("Float: "+f);

        System.out.print("Enter double: ");
        double d = sc.nextDouble();
        System.out.println("Double: "+ d);

        System.out.print("Enter string: ");
        // IMPORTANT: After reading numbers, scanner will still have '\n' in its buffer. So when we call nextLine(), '\n' will be executed
        //and we will not be able to enter string value. In such cases, call nextLine() before storing it in a variable.
        sc.nextLine();
        String s = sc.nextLine(); // reads entire line that user enters.
        System.out.println("String nextLine(): "+s);

        Scanner scNew = new Scanner("Teju is studying Java and his mail is tejup@gmail.com");
        String email = scNew.findInLine("[a-z]+[0-9]*@[a-z]+.[a-z]+");
        System.out.println("Email is "+email);
    }
}
