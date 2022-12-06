// package Inheritence.Multilevel Inheritence;

// multilevel inheritence 
// public access modifier 

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

// class R extends Q{
//     public void display_y(){
//         System.out.println("Hello from R");
//     }
// }

// public class A {
//     public static void main(String args[]){
//         R obj = new R();
//         obj.display();
//         obj.display_x();
//         obj.display_y();
//     }
// }

class P{
    private void display(){
        System.out.println("Hello from P");
    }
}

class Q extends P{
    protected void display_x(){
        System.out.println("Hello from Q");
    }
}

class R extends Q{
    // public void display_x(){
    //     System.out.println("Hello from R");
    // }
}

public class A {
    public static void main(String args[]){
        R obj = new R();
        obj.display_x();
        // obj.display_();
        // obj.display();
    }
}

