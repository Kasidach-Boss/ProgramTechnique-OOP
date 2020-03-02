class Main{
    public static void main(String[] args) {
       Bicycle B1 = new Bicycle();
       B1.changeGear(5);
       B1.speedUp(80);
       B1.applyBrakes(20);
       System.out.println(B1.toString()); 
    }
        
    
}