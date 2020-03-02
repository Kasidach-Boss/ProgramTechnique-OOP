class Bicycle implements Vehicle{
    private int speed;
    private int gear;
    public Bicycle(){
        this.speed =0;
        this.gear =0;
    }
    public void changeGear (int toGear){
        this.gear = toGear;
    }
    public void speedUp (int increaseSpeed ){
        
        this.speed += increaseSpeed; 
    }
    public void applyBrakes(int decreaseSpeed){
       
        this.speed = this.speed - decreaseSpeed;
    }
    public String toString(){
        String v;
        v = "Speed: "+ this.speed +" "+"Gear: "+this.gear; 
        return v;
    }
}