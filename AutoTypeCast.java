class AutoTypeCast{
    public static void main(String[] args) {
        //boolean can't be typecasted.
        byte b = 97;
        System.out.println(b);
        short sh = b;
        System.out.println(sh);
        char c = (char)sh; //IMPORTANT: both short and char are 16 bits, but short is signed and char is unsigned. So need to explicitly typecast.
        System.out.println(c);
        int i = c;
        System.out.println(i);
        long l = i;
        System.out.println(l);
        float f = l;
        System.out.println(f);
        double d = f;
        System.out.println(d);
    }
}