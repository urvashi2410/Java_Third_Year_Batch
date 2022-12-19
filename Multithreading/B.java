// class MyClass implements Runnable{
//     public void run(){

//     }
// }

// public class B {
//     public static void main(String args[]){
//         // MyClass obj = new MyClass();
//         // Thread t = new Thread(obj, "Yash");
//     }
// }

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    public void run(){
        int count = 1;
        while(true){
            System.out.println(count++);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class B{
    public static void main(String args[]) throws Exception{
        MyThread obj = new MyThread("Hello World");
        // obj.interrupt();
        obj.setDaemon(true);
        obj.start();

        // try{
        //     Thread.sleep(100000);
        // }
        // catch(Exception e){

        // }

        Thread mainThread = Thread.currentThread(); 
        mainThread.join();
        // System.out.println("ID " + obj.getId());
        // System.out.println("Name " + obj.getName());
        // System.out.println("Priority " + obj.getPriority());
        // System.out.println("State " + obj.getState());
        // System.out.println("Alive " + obj.isAlive());
        // obj.start();
        // System.out.println("State " + obj.getState());
        // System.out.println("Alive " + obj.isAlive());
    }
}