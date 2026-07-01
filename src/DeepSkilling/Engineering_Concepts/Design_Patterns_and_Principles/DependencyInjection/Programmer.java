package DeepSkilling.Engineering_Concepts.Design_Patterns_and_Principles.DependencyInjection;

public class Programmer {
//    private Laptop lap;
//    public Programmer(Laptop lp){
//        lap=lp;
//    }
//
//    private Desktop ds;
//    public Programmer(Desktop des){
//        ds=des;
//    }

//     Above code doesn't give true loose coupling we need another constructor again if new device needed

    private Device device;

    public Programmer(Device d){
        this.device=d;
    }

    public void writeCode(){
        device.work();
    }
}
