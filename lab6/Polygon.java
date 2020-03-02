public abstract class Polygon {
    private int n; 
    protected double[] sides; 
    protected double area;
    abstract public void calArea();
    public double getArea() {
            return area;
    }
    public Polygon(int nb) {
            n = nb;
            sides = new double[n]; 
    }
     
}
    