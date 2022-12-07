// package Reference Variable;
class Q{
    int x = 10;
    int y = 80;

    // scope = function scope = local 
    int display(Q m, Q n){
        m.x = 56;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        return 1;
    }
}

class B {
    public static void main(String args[]){
        Q e = new Q();
        Q f = new Q();
        f.y = 78;
        e.display(e, f);
        f.display(e, f);
    }
}
