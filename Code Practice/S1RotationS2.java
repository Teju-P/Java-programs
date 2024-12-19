public class S1RotationS2 {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "cdefab";
        System.out.println("s1 = "+s1+"\ns2 = "+s2);
        s1 = s1.concat(s1);
        System.out.println("s1+s1 = "+s1);
        //boolean cont = s1.contains(s2);
        //System.out.println("cont = "+cont);
        if(s1.contains(s2)){
            System.out.println("Yes, the s2 is rotated "+s1.indexOf(s2)+" times left/right");
        }
        else System.out.println("No");
    }
}
