// package Constructor;
// why constructor ? = so that no garbage value is assigned to any variable 
// default constructor = assign default values to the variables = 0, null 
// constructor vs functions = 
//1. constructor has same name as class but functions dont
//2. constructor doesnt have any return type but functions do 
//3. contructor do not return anything but functions do 
//4. we dont need to call constructor it automatically gets called when we make an object but we have to call functions manually

// java provides a default constructor 

class P{
    int x;
    String s;
    // default constructor 
    P(){
        x = 0;
        s = null;
    }

    void display(){
        System.out.println(x);
        System.out.println(s);
    }
}

class A {
    public static void main(String args[]){
        P obj = new P();
        obj.display();
    }
}
