package Revision_programs;

public class FirstNonRepeatedCharInString {
    public static void main(String[] args) {
        String s = "This is the Times Of India";
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                System.out.println(s.charAt(i)+" is the first non repeated char in the string");
                break;
            }
        }
    }
}
