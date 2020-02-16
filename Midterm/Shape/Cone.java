class Cone extends Shape3D{
    private double radius;
    private double height;
    public Cone(String n , double r ,double h){
        super(n);
        this.radius = r;
        this.height = h;
    }
    public double getVolume(){
        double v= 1.0/3 * Math.PI * radius * radius * height;
        return v;
    }
}