public class GenericMethodDemo1 {

    static <T, V extends T> boolean isIn(T x, V[] y){
        for(int i=0; i< y.length;i++){
            if(x.equals(y[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1,2,3};
        if(isIn(2, nums)) System.out.println("2 is in nums");
        if(!isIn(7, nums)) System.out.println("7 is not in nums");
        System.out.println();
        String days[] = {"sun","mon","sat"};
        if(isIn("sun", days)) System.out.println("sun is in days");
        if(!isIn("thu", days)) System.out.println("thu is not in days");
    }
}
