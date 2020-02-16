class Pokemon {
    private String name;
    public int maxHp;
    public int hp;
    public Pokemon(String n ){
        this.name = n;
        this.maxHp = (int)(Math.random()*100);
        this.hp = (int)(Math.random()*maxHp);

    }
    public String getName(){
        return this.name;
    }
    public void eat(){
        if(this.hp < this.maxHp-10){
            this.hp +=10;
        }
        else {
            this.hp = this.maxHp;
        }
        
       
    }
    public String toString(){
        String P = name+"HP:"+hp+"/"+maxHp;
        return P;
    }
}