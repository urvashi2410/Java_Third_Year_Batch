// package Anonymous block;

// Anonymous block = member of java class, it doesnt have any name, it contains statements or code which should be common to all the constructors 
class P{
    public P(){
        System.out.println("Default constructor");
    }

    public P(int i){
        System.out.println("Parameterised constructor");
    }

    // anonymous block 
    {
        System.out.print("Object is created by ");
    }
}

public class A {
    public static void main(String args[]){
        P obj = new P();
        P obj1 = new P(2);
    }
}
