import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        int temp;
        Scanner sc = new Scanner(System.in);
        int rot = sc.nextInt();
        
        for(int i=0;i<rot;i++){
            temp = a[0];
            for(int j=1;j<a.length;j++){
                a[j-1] = a[j];
            }
            a[a.length-1] = temp;
        }

        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
