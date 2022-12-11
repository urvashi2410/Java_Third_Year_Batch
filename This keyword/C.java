// this =  to return everything present inside the class into the main class 
class R{
    int a;
    int b;

    R(){
        a = 4;
        b = 9;
    }

    R get(){
        return this;
    }

    void display(){
        System.out.println(a + " " + b);
    }
}

public class C{
    public static void main(String args[]){
        R obj = new R();
        obj.display();
        System.out.println(obj.get().a);
        obj.get().display();
    }
}
