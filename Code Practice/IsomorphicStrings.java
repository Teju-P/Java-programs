import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "egg"; //foo
        String s2 = "add"; //bar
        if(s1.length()!=s2.length()){
            System.out.println("Not isomorphic!");
            System.exit(1);
        }
        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(hm1.containsKey(c1)){
                if(hm1.get(c1)!=c2){
                    System.out.println("Not isomorphic!");
                    System.exit(1);
                }
            }
            else{
                hm1.put(c1, c2);
            }
            if(hm2.containsKey(c2)){
                if(hm2.get(c2)!=c1){
                    System.out.println("Not isomorphic!");
                    System.exit(1);
                }
            }
            else{
                hm2.put(c2, c1);
            }
        }
        System.out.println("Isomorphic!");
    }
}
