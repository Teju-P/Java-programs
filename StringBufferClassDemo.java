import java.lang.StringBuffer;

public class StringBufferClassDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("HEllo ");
        String s;
        sb.ensureCapacity(17); //try different values. Below 16, capacity will be set to 16. For 17 - 34 capacity set to 34.
        // Above 34, capacity will be set to specified capacity;
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        //sb.setLength(7);
        //System.out.println(sb.length()); //adds '\0' (null character) to the end to achieve the length. null char will not be displayed in O/P.
        sb.append("Teju");
        sb.append("_");
        sb.append(22);
        System.out.println(sb);
        sb.insert(5, ", Welcome");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb);
        System.out.println(sb.length());
        for(int i=0;i<sb.length();i++){
            System.out.println("Char at: "+i+" = "+sb.charAt(i));
        }
        sb.delete(19,sb.length());
        System.out.println(sb);
        sb.replace(15, sb.length(), "Teju P");
        System.out.println(sb);
        String substr = sb.substring(15);
        System.out.println("Name: "+substr);
        substr = sb.substring(15, 19);
        System.out.println("Firstname: "+substr);
        char [] c = new char[20];
        sb.getChars(15, sb.length(), c, 0);
        for(char i : c){
            System.out.print(i+"#");
        }System.out.println();
        System.out.println("sb now:"+sb);
        sb.setCharAt(1, 'e');
        System.out.println("sb after setCharAt(): "+sb);
    }
}
