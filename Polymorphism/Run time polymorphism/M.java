// package Run time polymorphism;
class X{
    private void func(){
        System.out.println("Inside Private X func");
    }

    protected void func1(){
        System.out.println("Inside Protected X func1");
    }
}

class Y extends X{
    private void func(){
        System.out.println("Inside Private X func");
    }

    // protected void func1(){
    //     System.out.println("Inside Public Y func1");
    // }
}

public class M {
    public static void main(String args[]){
        X obj1 = new X();
        obj1.func1();
        // obj1.func();

        X obj2 = new Y();
        obj2.func1();
        // obj2.func();
    }
}
