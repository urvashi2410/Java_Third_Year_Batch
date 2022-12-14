// package Multithreading;

// single flow of execution 
// class P{
//     void display(){
//         System.out.println("Hello");
//     }
// }

// public class A {
//     public static void main(String args[]){
//         P obj = new P();
//         obj.display();
//         System.out.print("world");
//     }
// }

// class P{
//     void display(){
//         int i = 1;
//         while(true){
//             System.out.println(i + "Hello");
//             i++;
//         }
//     }
// }

// public class A {
//     public static void main(String args[]){
//         P obj = new P();
//         obj.display();
//         int i = 1;
//         while(true){
//             System.out.println(i + "world");
//             i++;
//         }
//     }
// }

// StringBuffer = already built 
// Thread class inheritence 
class P extends Thread{
    // run is mandatory function 
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i + "Hello");
            i++;
        }
    }
}

public class A {
    public static void main(String args[]){
        P obj = new P();
        obj.start();
        int i = 1;
        while(true){
            System.out.println(i + "world");
            i++;
        }
    }
}