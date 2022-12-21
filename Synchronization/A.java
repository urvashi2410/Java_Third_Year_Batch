// shared resource 
// monitor is used here 
class P{
    synchronized public void display(String s){
        // synchronized(this){
            for(int i = 0; i < s.length(); i++){
                System.out.println(s.charAt(i));
            }
        // }
    }
}

class Q extends Thread{
    P obj;
    public Q(P obj){
        this.obj = obj;
    }

    public void run(){
        obj.display("Hello world");
    }
}

class R extends Thread{
    P obj;
    public R(P obj){
        this.obj = obj;
    }

    public void run(){
        obj.display("R class Display");
    }
}

public class A {
    public static void main(String args[]){
        P obj1 = new P();

        Q obj2 = new Q(obj1);
        R obj3 = new R(obj1);

        obj2.start();
        obj3.start();
    }
}
