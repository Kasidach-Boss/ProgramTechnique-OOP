class Square extends Polygon{
   
    public Square (double l){
        super(4);
        sides[0]=l;
    }
   
    public double getArea(){
       area = sides[0]*sides[0];
       return area;
    }
    public double getSide(){
        return sides[0];
    }
    public void calArea(){

    }
}