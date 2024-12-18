import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        String a, b;
        int ai = 0, bi = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next();
        int m=0;
        
        for(int i=a.length()-1;i>=0;i--){
            //System.out.print(a.charAt(i)+"  ");
            ai += (Integer.parseInt(String.valueOf(a.charAt(i)))*Math.pow(2, m));
            //System.out.print("ai = "+ai+"  ");
            m++;
            //System.out.println("m = "+m+"  ");
        }
        m=0;
        System.out.println("ai = "+ai);

        for(int i=b.length()-1;i>=0;i--){
            //System.out.print(a.charAt(i)+"  ");
            bi += (Integer.parseInt(String.valueOf(b.charAt(i)))*Math.pow(2, m));
            //System.out.print("ai = "+ai+"  ");
            m++;
            //System.out.println("m = "+m+"  ");
        }
        //m=0;
        System.out.println("bi = "+bi);
        int sum = ai+bi;
        System.out.println("ai+bi = "+sum);
        System.out.println(a+" + "+b+" = "+Integer.toBinaryString(sum));
    }   
}
