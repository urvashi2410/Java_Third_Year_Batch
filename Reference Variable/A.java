// package Reference Variable;
class P{
    int x = 5;
    int display(){
        System.out.println("x = "+ x);
        return 1;
    }
}

class A {
    public static void main(String args[]){
        P obj = new P();
        P obj1 = obj;
        P obj3 = new P();
        P obj4 = obj3;
        obj1.x = 45;
        obj4.x = 90;
        System.out.println(obj3.x);
        System.out.println(obj.x);
        // System.out.println(obj);
        // System.out.println(obj.display());
    }
}
