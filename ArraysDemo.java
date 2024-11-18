public class ArraysDemo {
    public static void main(String[] args) {
        int [] a;
        char c[] = {'a','b','c','d'};
        System.out.println(c); //IMPORTANT: char array can be print directly without using loops.
        String s[] = {"Teju","Hello","World"};
        for(String x:s){
            System.out.println(x);
        }
        String cars[] = {"Toyota","Audi","Tata","Benz","Volvo"};
        System.out.println(cars[1]);
        cars[1] = "Volkswagon";
        System.out.println(cars[1]);
        int [] matrix [] = {{1,2,3,4},{5,6,7,8}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int rows[]:matrix){
            for(int cols:rows){
                System.out.print(cols+" ");
            }
            System.out.println();
        }
        
    }
}
