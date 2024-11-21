public class SquareRunner {
    public static void main(String[] args) {
        Square a = new Square(2);
        Square b = new Square(14);
        
        System.out.println("Area of a: "+a.calculateArea());
        System.out.println("Perimeter of a: "+a.calculatePerimeter());

        System.out.println("Area of b: "+b.calculateArea());
        System.out.println("Perimeter of b: "+b.calculatePerimeter());
    }
}
