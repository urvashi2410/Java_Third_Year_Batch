// package Super class;
// parent class 
// super keyword
class R{
    String name = "Yash";
}

class P extends R{
    String name = "Rohit";
}

class Q extends P{
    String name = "Esha";

    void display(){
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class A {
    public static void main(String args[]){
        Q obj = new Q();
        obj.display();
    }
}
