public class Square {

    private int side;

    public Square(int side) {
        // TODO: Initialize side with the passed value
        this.side = side;
    }

    public int calculateArea() {
        // TODO: Calculate and return the area of the square
        if(side<=0) return -1;
        else
        return side*side;
    }

    public int calculatePerimeter() {
        // TODO: Calculate and return the perimeter of the square
        if(side<=0) return -1;
        else
        return 4*side;
    }

}