class Q{
    int a;
    int b;

    Q(){
        // parameterised constructor call 
        this(23, 56);
        System.out.println("Default constructor");
    }

    Q(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Parameterised constructor" + " " + this.a + " " + this.b);
    }
}

public class B {
    public static void main(String args[]){
        Q obj = new Q();
    }
}
