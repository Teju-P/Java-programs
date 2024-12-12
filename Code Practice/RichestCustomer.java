

public class RichestCustomer {
    public static void main(String[] args) {
        int cust[][] = new int[3][];
        cust[0] = new int[]{7,1,3};
        cust[1] = new int[]{2,8,7};
        cust[2] = new int[]{1,9,15};
        int x=1;
        for(int row[]:cust){
            System.out.print("Customer "+x+++": ");
            for(int col: row){
                System.out.print(col+" ");
            }System.out.println();
        }
        int money = 0;
        int cHint = 0;
        for(int i=0;i<cust.length;i++){
            int sum = 0;
            for(int j=0;j<cust[i].length;j++){
                sum+=cust[i][j];
            }
            if(sum>money){
                money = sum;
                cHint = i;
            }
        }
        System.out.print("Richest customer is Customer "+(cHint+1)+" with an evaluation of $"+money);
    }
}
