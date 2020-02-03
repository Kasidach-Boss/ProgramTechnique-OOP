public class PermanentEmployee extends Employee{
   private float salary;
   public PermanentEmployee(float s){
       super(n,a,EmId);
       this.salary = s;
   }
   @override
   public void introduce(){
       System.out.println("Name:"+super.name);
       System.out.println("Name:"+super.age);
       System.out.println("Name:"+super.employeeid);
       System.out.println("Salary: "+this.salary);
   }
}