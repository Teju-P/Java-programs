public class VarArgsDemo {
    static void VADemoJDK4(int v[]){
        System.out.println("No. of args = "+v.length);
        for(int i : v){
            System.out.print(i+" ");
        }System.out.println();
    }

    static void VADemo(int ...v){
        System.out.println("No. of args: "+v.length);
        for(int i : v){
            System.out.print(i+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int n1[] = {10};
        int n2[] = {20,30,24};
        VADemoJDK4(n1);
        VADemoJDK4(n2);
        VADemo(100);
        VADemo(105,2530,5688,14);
    }
}
