public class MyCharRunner {
    public static void main(String[] args) {
        MyChar ob1 = new MyChar('c');
        MyChar ob2 = new MyChar('e');
        if(ob1.isVowel()) System.out.println(ob1.c+" is an vowel");
        else System.out.println(ob1.c + " is not an vowel");
        if(ob2.isVowel()) System.out.println(ob2.c+" is an vowel");
        else System.out.println(ob2.c + " is not an vowel");
    }
}
