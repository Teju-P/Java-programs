//Jagged array is also known as irregular array.

public class JaggedArray {
    public static void main(String[] args) {
        int a[][] = new int[4][];
        a[0] = new int[1];
        a[1] = new int[2];
        a[2] = new int[3];
        a[3] = new int[4];
        int value = 1;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j] = value++;
            }
        }

        for(int row[]: a){
            for(int col: row){
                System.out.print(col+" ");
            }System.out.println();
        }
    }
}
