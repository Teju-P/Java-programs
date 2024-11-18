import java.io.*;
import java.util.Scanner;

class compressedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "a2b1a3c2b2";
        char arr[] = new char[input.length()/2];
        //System.out.println(arr.length);
        int pos = 0;
        for(int i=0;i<input.length();i=i+2){
            arr[pos] = input.charAt(i);
            pos++;
        }
        /*for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]='?';
                }
            }
        }
        /*
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        */
        //System.out.println(arr.length);
        

        char new_arr[] = new char[input.length()];
        int x = 0;
        for(char ele : arr){
            int count = 0;
            for(int j=0;j<input.length();j=j+2){
                if(ele==input.charAt(j)){
                    //System.out.println(input.charAt(j+1));
                    count+=Integer.parseInt(String.valueOf(input.charAt(j+1))); //int numericValue = Character.getNumericValue(ch);
                    //System.out.println(ele+" count is "+count);
                }
                //System.out.println(count);
            }
            //System.out.println(ele+" = "+count);
            new_arr[x]=ele;
            new_arr[x+1]=(char)(count+'0');
            x=x+2;
        }
        for(int i=0;i<new_arr.length;i++){
            if(new_arr[i]=='?') {
                i=i+1;
                continue;
            }
            else{
                System.out.print(new_arr[i]);
            }
        }

    }
}
