package Revision_programs;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication{
    public static void main(String[] args) {
        int a[][] = {{1,2,1},{2,1,1},{1,1,2}};
        int b[][] = {{7,1},{6,2},{5,3}};
        int res[][] = new int[3][2];
        System.out.println("The matrix a is: "+Arrays.deepToString(a));
        System.out.println("The matrix b is: "+Arrays.deepToString(b));
        if(a[0].length!=b.length){
            System.out.println("Can't perform multiplication as mxn != nxo");
            System.exit(1);
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<a[0].length;k++){
                    res[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Multiplied matrix: ");
        System.out.println(Arrays.deepToString(res));
    }
}