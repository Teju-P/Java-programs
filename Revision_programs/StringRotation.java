package Revision_programs;

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "Teju"; //TejuTeju
        String s2 = "ejuT";
        String s3 = s1+s1;
        if(s3.contains(s2)) System.out.println("True");
        else System.out.println("False");
    }
}
