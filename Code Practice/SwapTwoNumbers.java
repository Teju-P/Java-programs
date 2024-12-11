public class SwapTwoNumbers {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 2;
        int temp;
        System.out.println("Before swapping n1 = "+n1+" n2 = "+n2);
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swapping n1 = "+n1+" n2 = "+n2);

        //swapping without using temp variable.
        int x = 12;
        int y = 17;
        System.out.println("BEFORE SWAPPING: \nx = "+x+"\ny = "+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("AFTER SWAPPING: \nx = "+x+"\ny = "+y);
    }
}
