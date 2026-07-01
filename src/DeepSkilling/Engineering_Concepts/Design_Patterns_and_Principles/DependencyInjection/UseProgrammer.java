package DeepSkilling.Engineering_Concepts.Design_Patterns_and_Principles.DependencyInjection;

public class UseProgrammer {
    public static void main(String[] args) {
//        Laptop lap=new Laptop("Dell");
//        Desktop desk=new Desktop("Lenovo");
//        but creating diff constructors inside Programmer doesn't actually give true loose coupling
//        Whyy?? --> tomorrow if I use another type of device then programmer needs to be changed (constructor)
//        Soln --> Use an interface Device to give true abstraction and loose coupling

//        Programmer aks=new Programmer(lap);
//        aks.writeCode();
//        Programmer akshay=new Programmer(desk);
//        akshay.writeCode();

        // Good practice now-->

        //instead of creating objects and passing them just directly pass like below
        Programmer p1=new Programmer(new Laptop("HP"));
        Programmer p2=new Programmer(new Desktop("Lenovo"));

        p1.writeCode();
        p2.writeCode();

    }
}
