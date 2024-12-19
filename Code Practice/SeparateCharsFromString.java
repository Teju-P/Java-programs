public class SeparateCharsFromString {
    public static void main(String[] args) {
        String s = "CHARACTERS";
        System.out.println("Before split: "+s);
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i)+" "); // char + String = String (implicit type casting)
        }
        System.out.println("After split: "+sb.toString());
    }
}