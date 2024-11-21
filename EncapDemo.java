class EncapDemo{
    private int speed;
    void setSpeed(int speed){
        this.speed = speed;
    }
    void getSpeed(){
        System.out.println(speed);
    }
    void increaseSpeed(int howMuch){
        speed+=howMuch;
    }
    void decreaseSpeed(int howMuch){
        if(speed>=howMuch){
            System.out.println("Decreasing speed...");
            speed-=howMuch;
        }
        else{
            System.out.println("Can't do it! Making speed zero...");
            speed = 0;
        }
    }
}