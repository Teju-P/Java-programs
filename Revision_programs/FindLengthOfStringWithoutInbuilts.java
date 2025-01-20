package Revision_programs;

public class FindLengthOfStringWithoutInbuilts {
    public static void main(String[] args) {
        String s = "My name is Teju";
        int l = 0;
        try{
            for(int i=0;s.charAt(i)!='\0';i++){
                l++;
            }
            System.out.println("Length of "+s+" = "+l);
        }catch(Exception e){
            System.out.println("Length of the string \""+s+"\" = "+l);
        }
    }
}
