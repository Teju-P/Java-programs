public class BoxingAndUnboxing {
    public static void main(String[] args) {
        //Manual boxing and unboxing:
        Integer iob = new Integer(100);
        int i = iob.intValue(); //similarly byteValue(), floatValue(), doubleValue(), longValue(), shortValue().
        System.out.println("iob = "+iob+"    "+"i = "+i);

        //Auto boxing:
        Integer iob2 = 100;
        //Auto unboxing
        int j = iob2;
        System.out.println("iob2 = "+iob2+"    "+"j = "+j);
    }
}
