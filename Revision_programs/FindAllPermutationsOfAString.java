package Revision_programs;

public class FindAllPermutationsOfAString {

    public static void findPermi(String str, String prefix){
        if(str.isEmpty()){
            System.out.println(prefix);
            return;
        }
        for(int i=0;i<str.length();i++){
            char current = str.charAt(i);
            String remaining = str.substring(0, i)+str.substring(i+1);
            findPermi(remaining, prefix+current);
        }
    }

    public static void main(String[] args) {
        String s = "ABC";
        System.out.println("Permutations of "+s+" is ");
        findPermi(s,"");
    }
}
