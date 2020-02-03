public class ContractEmployee extends Employee{
    private float payment;
    public ContractEmployee(float p){
        super(n,a,EmId);
        this.payment = p;
    }
    @override
    public void introduce(){
        System.out.println("Name:"+super.name);
        System.out.println("Name:"+super.age);
        System.out.println("Name:"+super.employeeid);
        System.out.println("Payment: "+this.payment);

    }
}
