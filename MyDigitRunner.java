public class MyDigitRunner {
    public static void main(String[] args) {
        MyDigit n1 = new MyDigit('c');
        MyDigit n2 = new MyDigit('7');
        if(n1.isDigit()) System.out.println(n1.digit+" is a digit");
        else System.out.println(n1.digit+" is not a digit");
        if(n2.isDigit()) System.out.println(n2.digit+" is a digit");
        else System.out.println(n2.digit+" is not a digit");
    }
}
