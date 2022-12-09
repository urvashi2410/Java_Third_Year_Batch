// parameterised constructor 
// default constructor will work only when there is no parameterised constructor in the class
class Q{
    int age;
    String name;

    Q(int a, String n){
        age = a;
        name = n;
    }

    void display(){
        System.out.println(age + " " + name);
    }
}

public class B {
    public static void main(String args[]){
        Q obj = new Q(20, "Nishant");
        Q obj1 = new Q(19, "Rahul");

        obj.display();
        obj1.display();
    }
}
