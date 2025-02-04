class CompDemo{
    private int x=10;
    int getX(){
        return x;
    }
    void setX(int val){
        x = val;
    }
}

class CompareTwoObjects{
    public static void main(String[] args) {
        CompDemo o1 = new CompDemo();
        CompDemo o2 = o1; //refrencing: o2 refers same object that o1 refers to.
        CompDemo o3 = new CompDemo();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        
        System.out.println(o1==o2);
        System.out.println(o1==o3);

        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode()==o1.hashCode());
        System.out.println(o3.hashCode());

        System.out.println("================================================");

        String s1 = "Teju"; //String literal
        String s2 = "Teju"; //String literal
        String s3 = new String("Teju"); //String object

        System.out.println(s1==s2);
        System.out.println(s1==s3); // == compares reference not value.

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3)); // equals() compares values not reference.
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}