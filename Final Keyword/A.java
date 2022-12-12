// package Final Keyword;
// final keyword = constant and immutable value 
// its value cannot be changed outside the class 
// normal vs final variable = once set cannot be changed in final 
// final variables will be of same value in the whole program 
// C++ const keyword 

class P{
    final int age = 20;
    final int marks;
    final String name;
    static final double salary = 90;
    static final int rollNo;
    // initialisation 
    {
        marks = 45;
    }

    static {
        rollNo = 56;
    }

    P(){
        name = "pooja";
    }
}

public class A {
    public static void main(String args[]){

    }
}
