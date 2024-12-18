/*Display elements column-wise. i.e., 00, 10, 20, 01, 11, 21, 02, 12, 22 for 3x3 matrix. 
The matrix can have any order line 2x2, 4x4. */

import java.util.Arrays;
import java.util.Scanner;

public class WaveMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("m = ");
        int m = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("Matrix order mxn = "+m+"x"+n);
        int a[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("a["+i+"]["+j+"] = ");
                a[i][j] = sc.nextInt();
                //System.out.println();
            }
        }
        System.out.println("a[][] = "+Arrays.deepToString(a));
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[j][i]+" ");
            }System.out.println();
        }
    }
}
