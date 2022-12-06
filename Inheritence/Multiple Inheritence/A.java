// package Inheritence.Multiple Inheritence;
// Multiple Inheritence = not supported by java 
// But we can perform multiple inheritence using interfaces 

// Interface contains the prototype of the methods 
// and we have to implement their body in other class to do multiple inheritence 
// we cannot create objects of an interface 

interface P{
    // abstract methods 
    public void display();
}

interface Q{
    public void display_x();
}

interface R extends P, Q{
    // it contains three abstract methods = display, display_x , display_y
    public void display_y();
}

// Abstract class = a class which is implementing the interfaces but not implementing each and every function in the interface 
class X implements R{
    public void display(){
        System.out.println("Hello from display");
    }

    public void display_x(){
        System.out.println("Hello from display_x");
    }

    public void display_y(){
        System.out.println("Hello from display_y");
    }
}

public class A {
    public static void main(String args[]){
        X obj = new X();
        obj.display();
        obj.display_x();
        obj.display_y();
    }
}
