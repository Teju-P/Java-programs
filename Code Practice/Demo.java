import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        String s = "Abcdedgh";
        //String x = "";
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
        ArrayList<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(5);
        i.add(3);
        i.add(1);
        i.add(2);
        Collections.sort(i);
        int lar = i.get(i.size()-1);
        for(int j=i.size()-2;j>=0;j--){
            if(lar == i.get(j)) continue;
            else{
                System.out.println(i.get(j));
                break;
            }
        }
        System.out.println(i);
    }
}

