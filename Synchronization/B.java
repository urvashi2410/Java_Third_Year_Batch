// shared object 
class M{
    int value;
    boolean flag = true;
    synchronized public void set(int v){
        while(flag != true){
            try{
                wait();
            }
            catch(Exception e){}
        }

        value = v;
        flag = false;
        notify();
    }

    synchronized public int get(){
        int x = 0;
        while(flag != false){
            try{
                wait();
            }
            catch(Exception e){}
        }
        x = value;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread{
    M obj;
    public Producer(M obj){
        this.obj = obj;
    }

    public void run(){
        int count = 1;
        while(true){
            obj.set(count);
            System.out.println("Producer " + count);
            count++;
        }
    }
}

class Consumer extends Thread{
    M obj;
    public Consumer(M obj){
        this.obj = obj;
    }

    public void run(){
        int value;
        while(true){
            value = obj.get();
            System.out.println("Consumer " + value);
        }
    }
}

public class B {
    public static void main(String args[]){
        M obj = new M();

        Producer p = new Producer(obj);
        Consumer c = new Consumer(obj);

        p.start();
        c.start();
    }
}
