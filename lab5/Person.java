public class Person {

    protected String name;
    protected int age;

    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
