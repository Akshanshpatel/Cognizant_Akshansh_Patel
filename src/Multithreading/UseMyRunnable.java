package Multithreading;

class myRun1 implements Runnable{
    public void run(){
        try{
            System.out.println(fact(5));
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public int fact(int n){
        if (n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}

class myRun2 implements Runnable{
    private Thread r2;

    public myRun2(String name){
        r2=new Thread(this,name);
        // this is 4th constructor type of Thread taking curr runnable object and name
        Thread t2=new Thread(r2);
    }
    @Override
    public void run(){
        try{
            System.out.println(r2.getName()+":"+fact(5));
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public void start(){
        r2.start();
    }

    public int fact(int n){
        if (n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}

class myRun3 implements Runnable{
    public void run(){
        try{
            System.out.println(fact(5));
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public int fact(int n){
        if (n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}


public class UseMyRunnable {
    public static void main(String[] args) {
        myRun1 r1=new myRun1();
        Thread th1=new Thread(r1);
        // Thread has a 3rd constructor type of argument taking a runnable object
        //this is one way another is we can make a constructor in r2 class check in r2
        th1.start();

        myRun2 r2=new myRun2("Shortcut thread");
        r2.start();

        myRun3 r3=new myRun3();
        Thread th3=new Thread(r1);

        th3.start();
        // join() is provided to make main thread sleep until all others child
        // threads are not executed otherwise we can manually do

        try{
            // this is called polling unnecessary waiting for other threads
            while(th1.isAlive() || th3.isAlive()){
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
