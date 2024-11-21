public class MyChar {
    char c;
    MyChar(char ch){
        c = ch;
    }
    boolean isVowel(){
        if(c == 'a'||c == 'e'||c == 'i'|| c == 'o'||c == 'u') return true;
        else return false;
    }
}
