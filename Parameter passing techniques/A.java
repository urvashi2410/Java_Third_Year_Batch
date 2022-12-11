// pass by value = changes are not reflected after function call in the main 
// but only seen in the function itself 

class P{
    void change(int c, int d){
        c++;
        d++;
        System.out.println(c + " " + d);
    }
}

class A{
    public static void main(String args[]){
        int a = 5;
        int b = 7;
        P obj = new P();
        obj.change(a, b);
        System.out.println(a + " " + b);

    }
}