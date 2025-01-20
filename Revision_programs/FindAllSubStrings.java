package Revision_programs;

//Total no. of substrings = n(n+1)/2, where n is the no. of characters in the given string.

public class FindAllSubStrings {
    public static void main(String[] args) {
        String s = "abcd";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
}
