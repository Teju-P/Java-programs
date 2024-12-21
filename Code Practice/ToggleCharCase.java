import java.util.Arrays;

public class ToggleCharCase {
    public static void main(String[] args) {
        String s = "My name is Teju P";
        System.out.println("Before toggle : "+s);
        char c [] = s.toCharArray();
        for(int i = 0;i<c.length;i++){
            if(c[i]>='a' && c[i]<='z'){
                c[i] = Character.toUpperCase(c[i]);
            }
            else if(c[i]>='A' && c[i]<='Z'){
                c[i] = Character.toLowerCase(c[i]);
            }
            else continue;
        }
        String res = new String(c);
        System.out.println("After toggle : "+res);
    }
}
