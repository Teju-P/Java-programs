/*Armstrong number also known as pluperfect, or Plus Perfect, or Narcissistic number.
  153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
  125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
 */

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nx = n;
        int ny = n;
        int count = 0;
        int sum = 0;
        while(n>0){
            count++;
            n/=10;
        }
        System.out.println("Count = "+count);
        while(nx>0){
            int temp = nx%10;
            sum+= Math.pow(temp, count);
            nx/=10;
        }
        System.out.println("Sum = "+sum);
        if(sum == ny) System.out.println(ny+" is an Armstrong number");
        else System.out.println(ny+" is not an armstrong number;");
    }
}
