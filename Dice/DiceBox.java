import java.util.ArrayList;
class DiceBox{
    private ArrayList<Dice> DiceBoxList;
    public DiceBox(){
        DiceBoxList = new ArrayList<Dice>();
    }
    public void add(Dice d){
        DiceBoxList.add(d);
    }
    public void shake(){
        for(int p=0; p < DiceBoxList.size(); p++){
            DiceBoxList.get(p).getFace();
        }
    }
    public int getTotal(){
        int result = 1;
        for (int p=0; p < DiceBoxList.size(); p++){
             result += DiceBoxList.get(p).getFace();    
        }
        return result;
    }
    public void printDices(){
        for (int p=1; p<= DiceBoxList.size(); p++){
            System.out.println(DiceBoxList.get(p).getFace());
        }
    }
}