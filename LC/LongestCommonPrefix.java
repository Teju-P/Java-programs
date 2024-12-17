package LC;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int index =0;
        int l = strs[index].length();
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<l){
                index = i;
            }
        }  
        String small = strs[index];
        System.out.println("Smallest string = "+small);
        String commString = "";
        for(int i=1;i<=small.length();i++){
            String subsmall = small.substring(0,i);
            Pattern p = Pattern.compile("^"+subsmall);
            Matcher m;
            //System.out.println("subsmall "+i+" = "+subsmall);
            boolean comm = true;
            for(int j=0;j<strs.length;j++){
                if(p.matcher(strs[j]).find()) comm = comm && true;
                else comm = comm && false;
            }
            if(comm){
                commString = subsmall;
            }
        }

        return commString;
    }

    public static void main(String[] args) {
        String []sArray = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(sArray));
    }
}