public class RGBColorRunner {
    public static void main(String[] args) {
        RGBColor x = new RGBColor(126, 225, 73);
        System.out.println("Red: "+x.getRed()+"\nGreen: "+x.getGreen()+"\nBlue: "+x.getBlue());
        x.invert();
        System.out.println("After inverting: ");
        System.out.println("Red: "+x.getRed()+"\nGreen: "+x.getGreen()+"\nBlue: "+x.getBlue());
    }
}
