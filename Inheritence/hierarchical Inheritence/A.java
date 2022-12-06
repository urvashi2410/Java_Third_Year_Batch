// package Inheritence.hierarchical Inheritence;
// multilevel inheritence = same parent with multiple children 

class P{
    public void display(){
        System.out.println("hello from P");
    }
}

class B extends P{
    public void display_x(){
        System.out.println("Hello from B");
    }
}

class C extends P{
    public void display_y(){
        System.out.println("Hello from C");
    }
}

class D extends P{
    public void display_z(){
        System.out.println("Hello from D");
    }
}

public class A {
    public static void main(String args[]){
        B obj1 = new B();
        obj1.display();
        obj1.display_x();

        C obj2 = new C();
        obj2.display();
        obj2.display_y();

        D obj3 = new D();
        obj3.display();
        obj3.display_z();
    }
}
