public class Main{
    public static void main (String args[]){
        Person human = new Person("Kan",500);
        Teacher T1 = new Teacher("Kan Alonely",500,"FHT");
        human.printDetails();
        T1.introduce();
    }
}