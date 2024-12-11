import java.util.Scanner;

public class EvilOdiousNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of iterations: ");
        int n=sc.nextInt();
        for(int num = 0;num<=n;num++){
            String bin = Integer.toBinaryString(num);
            System.out.println(num+" = "+bin);
            int bin_num = Integer.parseInt(bin);
            int count =0;
            for(int i=0;i<bin.length();i++){
                int temp = bin_num%10;
                bin_num/=10;
                if(temp == 1) count++;
                else continue;
            }
            System.out.println(num+" has "+count+" number of 1's");
            if(count%2 == 0) System.out.println(num+" is an evil number");
            else System.out.println(num+" is an odious number");
        }        
    }
}
