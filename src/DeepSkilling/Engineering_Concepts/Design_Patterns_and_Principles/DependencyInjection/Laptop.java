package DeepSkilling.Engineering_Concepts.Design_Patterns_and_Principles.DependencyInjection;

public class Laptop implements Device {
    public Laptop(String name){
        System.out.println(name+" Laptop created");
    }

    @Override
    public void work() {
        System.out.println("Working using Laptop");
    }
}
