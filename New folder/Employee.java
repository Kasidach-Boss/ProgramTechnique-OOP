public class Employee extends Person{
    protected String employeeid;
    public Employee(String n , int a,String EmId ){
        super(n,a);
        this.employeeid = EmId;
    }
    @override
    public void EMintroduce(){
        System.out.println("Name:"+super.name);
        System.out.println("Age:"+super.age);
        System.out.println("Employee id:"+ this.employeeid);
    }
}