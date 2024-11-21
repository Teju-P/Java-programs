import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class LocaleClassDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //locale() returns Locale class's object.
        System.out.println(sc.locale()); // en_IN : en is LC(Language Code) i.e., english. IN is CC(Country Code) here India.
        Locale loc1 = new Locale("en", "US");
        System.out.println(loc1); //en_US
        Locale loc2 = Locale.FRANCE;
        System.out.println(loc2);
        Locale loc3 = Locale.GERMANY;
        System.out.println(loc3);
//Locale methods:
        System.out.println(loc1.getLanguage());
        System.out.println(loc1.getCountry());
        System.out.println(loc1.getDisplayName());
        System.out.println(sc.locale().getDisplayCountry());
//NumberFormat class:
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
        String formattedNumber = nf.format(123456.789);
        System.out.println(formattedNumber);
//useLocale(Locale object) is used to change the locale of Scanner class object.
        sc.useLocale(Locale.GERMANY);
        System.out.println(sc.locale()+"\nEnter an integer number: ");
        int i = sc.nextInt();
        System.out.println(i);
//Creating new language using Locale class.
        Locale spanish = new Locale("es");
        Locale spain = new Locale("es", "ES");
        System.out.println(spain);
//useRadix() is used to specify radix of Scanner class. radix() will return the current radix used by Scanner class.
        Scanner sc_new = new Scanner("FFAD01");
        sc_new.useRadix(16); //Hexadecimal = 16
        System.out.println(sc_new.nextLong());
        System.out.println(sc_new.radix());
    }
}
