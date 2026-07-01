package DeepSkilling.Engineering_Concepts.Design_Patterns_and_Principles.DependencyInjection;

public class Desktop implements Device {
    public Desktop(String name){
        System.out.println(name+" Desktop created");
    }

    @Override
    public void work() {
        System.out.println("Working using Desktop");
    }
}
