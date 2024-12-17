public class ImmutableString {
    public static void main(String[] args) {
        String s1 = "Teju";
        String s2 = s1; // s2 and s1 both point to same string reference.
        System.out.println("s1 = "+s1+"\n"+"s2 = "+s2);
        if(s1==s2) System.out.println("Equal");
        else System.out.println("Not equal");
        s1 = s1 + " P"; // changing s1 must not change s2 to prove string are immutable.
        System.out.println("s1 = "+s1+"\n"+"s2 = "+s2);
        if(s1==s2) System.out.println("Equal");
        else System.out.println("Not equal");
        String s3 = new String("mango");
        //System.out.println(s3.getClass().getName());
        String s4 = new String(s3);
        System.out.println("s3 = "+s3+"\n"+"s4 = "+s4);
        if(s3==s4) System.out.println("Equal");
        else System.out.println("Not equal");
    }
}
