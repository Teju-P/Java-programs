public class StringMethods {
    public static void main(String[] args) {
        String name = "Teju";
        System.out.println("Length = "+name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(1));
        System.out.println(name.indexOf('e'));
        System.out.println(name.lastIndexOf('e'));
        System.out.println(name.compareTo("Teju"));
        System.out.println(name.compareTo("Apple"));
        System.out.println(name.compareTo("Zebra"));
        System.out.println(name.concat(" P."));
        System.out.println(name.contains("ej"));
        char c[] = {'H','e','l','l','o'};
        String s="";
        System.out.println(s.copyValueOf(c));
        System.out.println(name.endsWith("ju"));
        System.out.println(name.endsWith("le"));
        System.out.println(name.equals("Teju"));
        System.out.println(name.equals("Apple"));
        String h = "Hello %s, you are %d years old";
        System.out.println(String.format(h, "Teju", 22));
        byte b[] = name.getBytes();
        for(byte x : b){
            System.out.print(x+" ");
        }System.out.println();
        name.getChars(0, 4, c, 0); // Hello to Tejlo
        System.out.println(c);
        System.out.println(name.isEmpty());
        System.out.println(name.replace('e', 'E'));
        System.out.println(name.replaceAll("Tej","Thej"));
        System.out.println(name.replaceFirst("Tej", "Thej"));
        String sentence = "This is a demo string to split words at spaces, also commas and fullstops.";
        String[] spliStringArray = sentence.split("[,\\.\\\\s]"); //IMPORTANT: Regular expression.
        for(String x : spliStringArray){
            System.out.println(x);
        }
        System.out.println(name.subSequence(0, 3));
        System.out.println(name.substring(0));
        System.out.println(name.toString());
        String extraSpaceSentence = "    This is a sentence with extra leading and trialing spaces middle     spaces will not be removed          ";
        System.out.println(extraSpaceSentence.trim());
        System.out.println(String.valueOf(10.5));
        System.out.println(String.valueOf('c'));
        System.out.println(String.valueOf(true));
    }
}
