package Multithreading;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
        // without (super) java by default name it Thread-0,Thread-1...
        System.out.println("Thread details"+this);
    }
    //every work is done inside run for a thread
    public void run(){
        try{
            for (int i = 2; i <=10 ; i+=2) {
                System.out.println(getName()+":"+i);
                Thread.sleep(500);
            }
            System.out.println(getName()+" finished");
        }catch (InterruptedException ex){
            System.out.println(ex);
        }
    }

}


public class UseMyThread {
    public static void main(String[] args) {
        MyThread t1=new MyThread("even");

        // this t1 thread is like a child thread of main thread bcz its inside psvm which is handled by main thread
        // until t1 execution is not done Main thread should exist in memory
        // it is JVM dependent (OS dependent) that if parent (main) thread is killed t1 is also killed
        // implies main thread should die at last cz every os is not like windows(supportive)
        //** java gives us a method to make sure main thread remains alive this sleep is unprofessional **

        t1.start();

        // since priority of both is same numbers are printed in random order

        try{
            for (int i = 1; i <=10 ; i+=2) {
                System.out.println(Thread.currentThread().getName()+":"+i);
                Thread.sleep(500);
            }
            System.out.println(Thread.currentThread().getName()+" finished");
        }catch (InterruptedException ex){
            System.out.println(ex);
        }
    }
}
