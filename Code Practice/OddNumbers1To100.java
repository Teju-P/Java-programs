public class OddNumbers1To100 {
    public static void main(String[] args) {
        for(int i =1;i<=100;i++){
            if(i%2==0) continue;
            else System.out.println(i);
        }

        for(int i=1;i<=100;i=i+2){
            System.out.print(i+" ");
        }
    }
}
