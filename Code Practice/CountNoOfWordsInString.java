import java.util.Arrays;
import java.util.Scanner;

public class CountNoOfWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        s = s.trim(); //to remove leading and trailing spaces.
        System.out.println("After trim: "+s);
        String words [] = s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("There are "+words.length+" words in \""+s+"\"");

    }
}
