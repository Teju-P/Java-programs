public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[] = new int[]{5,7,-1,9,12,-47};
        int l = arr[0];
        for(int i=1;i<arr.length;i++){
            if(l<arr[i]){
                l = arr[i];
            }
        }
        System.out.println("Largest element = "+l);
    }
}
