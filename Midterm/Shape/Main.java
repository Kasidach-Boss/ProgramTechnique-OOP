class Main{
    public static void main (String [] args){
        /*Sphere N1 = new Sphere("N1",5);
        Cone C2 = new Cone ("A",5,10);
        System.out.println(N1.getVolume());
        System.out.println(C2.getVolume());*/
        Shape3D shapes[] = new Shape3D[4];
        shapes[0] = new Sphere("S1",10);
        shapes[1] = new Sphere("S2",5.5);
        shapes[2] = new Cone("C1",5,10);
        shapes[3] = new Cone("C3",7.5,10.5);
        Shape3D longest = findLongest(shapes); 
        for (int i=0; i < shapes.length; i++){
            System.out.println(shapes[i].getName()+ " = " +shapes[i].getVolume());
        }
        System.out.println("longest: "+longest.getName());
        System.out.println(longest.getVolume());
    }
    public static Shape3D findLongest(Shape3D[] shapes){
        Shape3D longest = new Shape3D("");
        for (int i=0; i < shapes.length; i++){
            if(longest.getVolume()< shapes[i].getVolume()){
                longest = shapes[i];
            }
        }
        return longest;
    }
}