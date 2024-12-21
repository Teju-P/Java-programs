import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("m = ");
        int m = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("Enter elements for mxn for mat: ");
        int mat[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = i+j;
            }
        }
        System.out.println("mat = "+Arrays.deepToString(mat));

        System.out.print("m2 = ");
        int m2 = sc.nextInt();
        System.out.print("n2 = ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements for m2xn2 for mat2: ");
        int mat2[][] = new int[m2][n2];
        for(int i=0;i<m2;i++){
            for(int j=0;j<n2;j++){
                mat2[i][j] = i*2;
            }
        }
        System.out.println("mat2 = "+Arrays.deepToString(mat2));

        int res[][] = new int [m][n2];
        if(n!=m2){
            System.out.println("Not possible");
            System.exit(0);
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat2[0].length;j++){
                for(int k=0;k<mat[0].length;k++){
                    res[i][j] += mat[i][k]*mat2[k][j];
                }
            }
        }
        System.out.println("Resultant matrix: "+Arrays.deepToString(res));

    }
}
