interface MinMax <T>{
    T min();
    T max();
}

class MinMaxRunner <T extends Comparable<T>> implements MinMax<T>{
    T vals[];
    MinMaxRunner(T []o){
        vals = o;
    }

    public T min(){
        T v = vals[0];
        for(int i=1;i<vals.length;i++){
            if(vals[i].compareTo(v)<0) v=vals[i];
        }
        return v;
    }

    public T max(){
        T v = vals[0];
        for(int i=1;i<vals.length;i++){
            if(vals[i].compareTo(v)>0) v=vals[i];
        }
        return v;
    }
}

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        Integer inums[] = {3,6,2,8,6};
        Character chs[] = {'b','r','p','w'};

        MinMaxRunner<Integer> iob = new MinMaxRunner(inums);
        MinMaxRunner<Character> cob = new MinMaxRunner<Character>(chs);
        System.out.println("Max of inums = "+iob.max());
        System.out.println("Min of inums = "+iob.min());
        System.out.println("Max of chs = "+cob.max());
        System.out.println("Min of chs = "+cob.min());
    }
}
