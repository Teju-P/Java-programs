import java.util.Scanner;

public class RightRotateArray {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int rot = sc.nextInt();
        int temp;
        for(int i = 0;i<rot;i++){
            temp = a[a.length-1];
            for(int j=a.length-2;j>=0;j--){
                a[j+1] = a[j];
            }
            a[0]=temp;
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
