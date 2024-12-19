import java.util.Arrays;

public class AllPossibleSubStrings {
    public static void main(String[] args) {
        String s = "FUN";
        int n = s.length();
        // No. of possible substrings = n(n+1)/2
        String sArray[] = new String[(n*(n+1))/2];

        int temp = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sArray[temp] = s.substring(i, j+1);
                temp++;
            }
        }
        System.out.println("All possible substrings of "+s+" is :");
        System.out.println(Arrays.toString(sArray));
    }
}
