public class DimensionRunner {
    public static void main(String[] args) {
        Dimension d = new Dimension(25);
        System.out.print("25 inch is "+d.getFeet()+" feet ");
        System.out.println(d.getInches()+" inches");

        Dimension e = new Dimension(-1);
        System.out.print("25 inch is "+e.getFeet()+" feet ");
        System.out.println(e.getInches()+" inches");
    }
}
