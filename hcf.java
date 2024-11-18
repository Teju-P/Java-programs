/*1. Write a program to find HCF of two numbers by without using recursion.

Input format:

The first line contains any 2 positive numbers separated by space.

Output format:

Print the HCF of given two numbers.

Sample Input:

70 15

Sample Output:

5 */
import java.io.*;
import java.util.Scanner;


class hcf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int gcd = findGCD(n1,n2);
        int lcm = (n1*n2)/gcd;
        System.out.println("GCD = "+gcd);
        System.out.println("LCM = "+lcm);
    }
    
    public static int findGCD(int a, int b){
        int res = 0;
        while (b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
            res = a;
        }
        return res;
    }
}