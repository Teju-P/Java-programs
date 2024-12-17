//AltErNAtE = aLTeRnaTe

import java.util.Scanner;

public class AlternateCaseOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c[] = s.toCharArray();
        for(char x:c){
            if(x>='A'&&x<='Z') System.out.print(String.valueOf(x).toLowerCase());
            else if(x>='a'&&x<='z') System.out.print(String.valueOf(x).toUpperCase());
            else System.out.print(x);
        }System.out.println();
    }
}
