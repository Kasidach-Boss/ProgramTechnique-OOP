public class ContractEmployee extends Employee{
    private float payment;
    public ContractEmployee(float p){
        super(n,a,EmId);
        this.payment = p;
    }
    @override
    public void introduce(){
        System.out.println(super.EMintroduce());
        System.out.println("Payment: "+this.payment);

    }
}