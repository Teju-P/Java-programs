package Java8;

interface I1{
    void zeroParam();
}

interface I2{
    void singleParam(int x);
}

interface I3{
    void multipleParam(int usn, String name);
}

public class Lambda2 {  
    public static void main(String[] args) {
        I1 o1 = () -> System.out.println("Zero parameters");
        I2 o2 = (x) -> System.out.println("Single parameter x = "+x);
        I3 o3 = (x, y) -> System.out.println("Multiple parameters USN = "+x+" NAME = "+y);
        
        o1.zeroParam();
        o2.singleParam(5);
        o3.multipleParam(176, "Teju");
    }
}
