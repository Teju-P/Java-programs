public class Dimension {
    private int feet;
    private int inches;
    
    public Dimension(int inches) {
        // TODO: Convert the total inches into feet and inches. One foot is 12 inches.
        // Store the feet and inches in their respective instance variables.
        if(inches<0){
            feet = -1;
            this.inches = -1;
        }
        else{
            this.inches = inches;
            feet = inches/12;
        }
    }
    
    public int getFeet() {
        // TODO: Return the value of feet.
        return feet;
    }
    
    public int getInches() {
        // TODO: Return the value of inches.
        if(inches<0) return -1;
        else return inches-feet*12;
    }    
}