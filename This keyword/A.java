// to differentiate class's variables with functions parameters having same names 

class P{
    int a;
    int b;

    P(int a, int b){
        this.a = a;
        this.b = b;
    }

    void display(){
        System.out.println(a + " " + b);
    }
}

public class A {
    public static void main(String args[]){
        P obj = new P(5, 10);
        obj.display();
    }
}
