public class CopyArray {
    public static void main(String[] args) {
        char c1[] = new char[]{'a','b','c','d','e'};
        char c2[] = new char[c1.length];
        for(int i=0;i<c1.length;i++){
            c2[i] = c1[i];
        }
        System.out.println("c2: ");
        for(char c: c2){
            System.out.print(c+" ");
        }
    }
}
