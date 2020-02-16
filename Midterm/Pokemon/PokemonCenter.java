import java.util.ArrayList;
class PokemonCenter{
    private ArrayList<Pokemon> PKL;
    public PokemonCenter() {
        PKL = new ArrayList<Pokemon>();
                
    }
    public void add(Pokemon p){
        PKL.add(p);
    }
    public void feed(){
        /*for (int i=0; i < PKL.size(); i++){
            PKL.get(i).eat();
        }*/
        for(Pokemon p : PKL){
            p.eat();
        }
    }
    public void printPokemons(){
        /*for (int i=0; i < PKL.size(); i++){
            System.out.println(PKL.get(i).toString());
        }*/
        for (Pokemon p : PKL){
            System.out.println(p.toString());
        }
    }
}