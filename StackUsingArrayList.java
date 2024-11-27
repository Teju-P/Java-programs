import java.util.ArrayList;
import java.util.Scanner;

public class StackUsingArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1. Push\t2. Pop\t3. Peek\t4. Push at specific index 5. Pop specific index 6. Exit");
            int choice = sc.nextInt();
        switch (choice) {
            case 1: System.out.print("Enter number you want to push: ");
                    int n = sc.nextInt();
                    num.add(n);
                    System.out.println("Pushed "+n+" into num");
                    break;
            case 2: if(num.size()>0){
                        int lastIndex = num.size()-1;
                        int m = num.get(lastIndex);
                        num.remove(lastIndex);
                        System.out.println("Popped "+m+" from num");
                        System.out.println("Updated num: "+num);
                        break;
                    }
                    else{
                        System.out.println("Stack underflow!");
                        break;
                    }
            case 3: for(int i=num.size()-1;i>=0;i--){
                        System.out.println(num.get(i)+" <-- "+i);
                    }
                    break;
            case 4: System.out.print("Enter number you want to push: ");
                    int nx = sc.nextInt();
                    System.out.print("Enter index: ");
                    int in = sc.nextInt();
                    num.add(in,nx);
                    System.out.println("Pushed "+nx+" into num at index "+in);
                    break;
            case 5: System.out.print("Enter index to be popped: ");
                    int index = sc.nextInt();
                    if(index<num.size() && index>=0){
                        int m = num.get(index);
                        num.remove(index);
                        System.out.println("Popped "+m+" from num");
                        break;
                    }
                    else{
                        System.out.println("Stack underflow!");
                        break;
                    }
            case 6: System.exit(0);
        
            default: System.out.println("Invalid choice!");
                    break;
        }
            
        }
    }
}
