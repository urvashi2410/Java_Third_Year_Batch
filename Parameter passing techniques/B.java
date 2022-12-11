// package Parameter passing techniques;
class Q{
    int a;
    int b;
    Q(int c, int d){
        a = c;
        b = d;
    }
    // pass by value  
    void change(Q a, Q b){
        obj.a += a;
        obj.b += 1;
        System.out.println(obj.a + " " + obj.b);
    }
}
public class B {
    public static void main(String args[]){
        int a = 5;
        int b = 7;
    
        Q obj = new Q(a, b);
        System.out.println(obj.a + " " + obj.b);
        obj.change(obj);
        System.out.println(obj.a + " " + obj.b);
        System.out.println(a + " " + b);
    }
}
