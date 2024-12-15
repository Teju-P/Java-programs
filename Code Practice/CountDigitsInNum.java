import java.util.Scanner;

public class CountDigitsInNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int x = sc.nextInt();
        int n = Math.abs(x);

        //1st way
        int count = String.valueOf(n).length();
        System.out.println(x+" has "+count+" digits");

        //2nd way
        count = (int) Math.log10(n) + 1;
        System.out.println(x+" has "+count+" digits");

        //3rd way
        char []c = String.valueOf(n).toCharArray();
        System.out.println(x+" has "+c.length+" digits");

        //4th way
        int i;
        for(i=0;n>0;i++){ //or use while loop
            n=n/10;
        }
        System.out.println(x+" has "+i+" digits");
    }
}
