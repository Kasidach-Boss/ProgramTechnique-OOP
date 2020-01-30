class Dice{
    private int Face;
    public Dice() {
        Face =1;
    }

    public int getFace(){
        return this.Face;
    }
    public void roll(){
       this.Face = 1+(int)(Math.random() *6);
        
    }
    public void SetFace(int f){
        Face = f;
    }
    public String toString(){
       String R = "Face ="+Face;
       return R;
    }
} 