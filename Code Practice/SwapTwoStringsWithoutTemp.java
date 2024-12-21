public class SwapTwoStringsWithoutTemp {
    public static void main(String[] args) {
        String s1 = "Teju";
        String s2 = "P";
        int l = s1.length();
        s1 = s1+s2;
        int l2 = s1.length();
        s2 = s1.substring(0, l);
        s1 = s1.substring(l,l2);
        System.out.println("New s1 = "+s1+"\ns2 = "+s2);
    }
}
