class M{
    void display(){
        System.out.println("This is display of M class");
    }
}

class N extends M{
    void display(){
        System.out.println("This is display of N class");
    }

    void func(){
        super.display();
    }
}

public class B {
    public static void main(String args[]){
        N obj = new N();
        obj.func();
    }
}
