public class Teacher extends Person{
    private String faculty;

    public Teacher(String n , int a, String f){
        super(n,a);
        this.faculty =f;
    }
    
    public void introduce(){
        System.out.println("Name:"+ super.name);
        System.out.println("Age:"+ super.age);
        System.out.println("Faculty:"+this.faculty);
    }
}