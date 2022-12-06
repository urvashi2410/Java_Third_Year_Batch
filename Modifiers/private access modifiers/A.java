// package Modifiers.private access modifiers;

// Abstraction 
// private = it is not accessible outside its own class 
// but we can access it through public function in same class 

class P {
    private int x;
    private void display(){
        System.out.println("Hello in private");
    }

    public void func(){
        this.x = 45;
        System.out.print(this.x);
    }
}

class A{
    public static void main(String args[]){
        P obj = new P();
        obj.func();
    }
}