// package Run time polymorphism;

// override = same functions but with different implementations in different classes 
class P{
    void display(){
        System.out.println("Inside P class");
    }
}

class Q extends P{
    void display(){
        System.out.println("Inside Q class");
    }
}

class R extends P{
    void display(){
        System.out.println("Inside R class");
    }
}

public class A {
    public static void main(String args[]){
        P obj;
        obj = new P();
        obj.display();

        obj = new Q();
        obj.display();

        obj = new R();
        obj.display();

        // Q obj = new Q();
        // obj.display();
    }
}
