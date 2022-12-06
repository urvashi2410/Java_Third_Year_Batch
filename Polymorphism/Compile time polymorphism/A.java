// compile time polymorphism 

class P{
    static int multiply(int a, int b){
        return a*b;
    }

    static double multiply(double a, int b){
        return a*b;
    }

    static int multiply(int a, int b, int c){
        return a*b;
    }
}

class A{
    public static void main(String args[]){
        // System.out.println(P.multiply(2, 3));
        System.out.println(P.multiply(2.0, 3));
        System.out.println(P.multiply(20, 3, 8));
    }
}