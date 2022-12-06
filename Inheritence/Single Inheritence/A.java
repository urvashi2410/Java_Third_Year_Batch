// package Inheritence;

// Single Inheritence 
// publically inherit 
// class P{
//     public void display(){
//         System.out.println("Hello from P");
//     }
// }

// class Q extends P{
//     public void display_x(){
//         System.out.println("Hello from Q");
//     }
// }

// public class A {
//     public static void main(String args[]){
//         Q obj = new Q();
//         obj.display();
//         obj.display_x();
//     }
// }

// Protected way of inheriting 
// class P{
//     protected void display(){
//         System.out.println("Hello from P");
//     }
// }

// class Q extends P{
//     public void display_x(){
//         System.out.println("Hello from Q");
//     }
// }

// public class A {
//     public static void main(String args[]){
//         Q obj = new Q();
//         obj.display();
//         obj.display_x();
//     }
// }

// private access modifier 
class P{
    private void display(){
        System.out.println("Hello from P");
    }
}

class Q extends P{
    public void display_x(){
        System.out.println("Hello from Q");
    }
}

public class A {
    public static void main(String args[]){
        Q obj = new Q();
        obj.display();
        obj.display_x();
    }
}
