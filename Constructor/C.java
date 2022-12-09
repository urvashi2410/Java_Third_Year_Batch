// constructor overloading 
class R{
    int age;
    String name;
    float marks;

    R(int a, String n){
        age = a;
        name = n;
    }

    R(int a, String n, float m){
        age = a;
        name = n;
        marks = m;
    }

    void display(){
        System.out.println(age + " " + name + " " + marks);
    }
}

public class C {
    public static void main(String args[]){
        // arguments 
        R obj = new R(34, "Riya");
        R obj1 = new R(23, "Tannu", 90);

        // R obj = new R();

        obj.display();
        obj1.display();
    }
}
