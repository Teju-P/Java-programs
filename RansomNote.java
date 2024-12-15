import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RansomNote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ransomNote: ");
        String ransomNote = sc.next();
        System.out.print("Enter magazine: ");
        String magazine = sc.next();
        Pattern p = Pattern.compile(ransomNote);
        Matcher m = p.matcher(magazine);
        boolean matchFound = m.find();
        if(matchFound) System.out.println(true);
        else System.out.println(false);

    }
}
