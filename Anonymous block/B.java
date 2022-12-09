// package Anonymous block;
// Static block = 

class Q{
    // Static block = called itself, it shifts to the start of class 
    // normal variables and functions = obj ki help se call 
    // static variable and functions = no obj is needed to call them but class name is used 
    static int i;
    String name;
    // static block 
    static{
        System.out.println("this is first static block");
    }

    static{
        System.out.println("this is second static block");
    }

    static void display(){
        System.out.println("This is display function");
    }

    void func(){
        System.out.println("Func function");
    }
}

public class B {
    public static void main(String args[]){
        Q obj = new Q();
        System.out.println(obj.name);
        obj.func();

        Q.display();
        System.out.println(Q.i);

    }
}
