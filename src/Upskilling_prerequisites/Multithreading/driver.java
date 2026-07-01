package Upskilling_prerequisites.Multithreading;

public class driver {
    public static void main(String[] args) {
        Thread th=Thread.currentThread();
        System.out.println(th); //this th is referring to main thread
        // output--> Thread[main,5,main] means it is of class Thread
        // , main is name, 5 is priority (CPU),last main is Thread group

        th.setName("Akshansh");
        System.out.println(th);

        try{
            for (int i = 0; i < 4; i++) {
                System.out.println(i);
                Thread.sleep(1000);
                //this sleep lets the thread become inactive so in meantime other threads can run
                // interrupt() brings the thread out of sleep
            }
        }catch (InterruptedException ex){
            System.out.println(ex);
        }

    }
}
