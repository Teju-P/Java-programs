enum Days{
    sun(1), mon(2), tue(3), wed(4), thu(5), fri(6), sat(7);
    private int number;
    Days(int num){ //Constructor initializes enum constants
        number = num;
    }
    int getNum(){ //method
        return number;
    }
}
public class EnumerationDemo {
    public static void main(String[] args) {
        System.out.println(Days.valueOf("sun")); //returns enum constant as a string.
        for(int i=0;i<Days.values().length;i++){
            System.out.print(Days.values()[i]+" "); //values() returns array of enum constants.
        }System.out.println();
        Days d = Days.fri;
        System.out.println(d);
        Days ob; //Here ob is enumeration variable, not an object.
        System.out.println(Days.mon.getNum());
        for(Days x:Days.values()){
            System.out.println(x+" is "+x.getNum());
        }
        System.out.println("ordinal() gives index of enum constant. It begins from zero. Here 'mon' index = "+Days.mon.ordinal());
        Days o1 = Days.sun;
        Days o2 = Days.thu;
        Days o3 = Days.sun;
        System.out.println(o1.compareTo(o2)); // 0 - 4 = -4
        System.out.println(o1.compareTo(o3)); // 0 - 0 = 0
        System.out.println(o2.compareTo(o1)); // 4 - 0 = 4 . i.e., 4 index difference between o2(thu) and o1(sun).  
        System.out.println(o1.equals(o3));
        System.out.println(o1.equals(o2));
    }
}
