public class WrapperClassesDemo {
    public static void main(String[] args) {
        Boolean bool = new Boolean(true);
        Byte b = new Byte("12");
        Short s = new Short((short)120);
        Character c = new Character('a');
        Integer i = new Integer(10234);
        Long l = new Long(123456879);
        Float f = new Float(15.7f);
        Double d = new Double("15.7");

        System.out.println("bool: "+bool);
        System.out.println("b: "+b);
        System.out.println("s: "+s);
        System.out.println("c: "+c);
        System.out.println("i: "+i);
        System.out.println("l: "+l);
        System.out.println("f: "+f);
        System.out.println("d: "+d);
    }
}
