
public class DivideByZeroExceptionDemo {
    public static void main(String[] args) {
        int a=10, b=0, res;
        try{
            res = a/b;
        }catch(Exception e){
            System.out.println("Caught exception: "+e);
        }
    }
}
