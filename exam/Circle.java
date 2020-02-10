class Circle extends Shape{
    private double radius;
    public Circle(String name ,double r ){
        super(name);
        this.radius =r;
    }
   // @Override
    /*public String getName(){
        return name;
    }*/
    @Override
    public double getArea(){
        double A = Math. PI* radius* radius;
        return A;
    }
}