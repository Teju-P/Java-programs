public class MyDigit {
    char digit;
    MyDigit(char digit){
        this.digit = digit;
    }
    boolean isDigit(){
        if(digit>=48 && digit<=57) return true; // '0' = 48(ASCII) and '9' = 57(ASCII). To know, do (int)'0', you'll get 48.
        else return false;
    }
}
