import java.util.*;

public class CheckNumPosOrNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        switch(Integer.signum(num)){
            case 0: System.out.println("Number is 0");
                    break;
            case 1: System.out.println("Number is positive");
                    break;
            case -1: System.out.println("Number is negative");
                    break;
            default: System.out.println("Invalid number");
        }
    }
}
