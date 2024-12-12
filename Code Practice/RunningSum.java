public class RunningSum {
    public static void main(String[] args) {
        int a[] = {3,1,2,10,1};  //op: [3,4,6,16,17]
        System.out.print("Original array: ");
        for(int i:a){
            System.out.print(i+ " ");
        }System.out.println();
        int sum = a[0];
        for(int i=1;i<a.length;i++){
            a[i] = a[i]+sum;
            sum = a[i];
        }
        System.out.print("Running Sum array: ");
        for(int i:a){
            System.out.print(i+ " ");
        }System.out.println();
    }
}
