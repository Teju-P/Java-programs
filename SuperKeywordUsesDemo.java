class Box {
    double width, height, depth;
    double vol;
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

class BoxWeight extends Box{
    double weight;
    BoxWeight(double w, double h, double d, double wt){
        super(w,h,d); // 1st use of super keyword is to call super class constructor.
        weight = wt;
        super.vol = w*h*d; // 2nd use of super keyword is to access super class members in sub class.
    }
}

class SuperKeywordUsesDemo {
    public static void main(String[] args) {
        BoxWeight bw = new BoxWeight(3, 5, 7, 8.37);
        Box b ;
        b = bw; //superclass referencing subclass.
        System.out.println("Volume: "+b.vol);
    }
}
