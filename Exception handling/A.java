// class A{
//     public static void main(String args[]){
//         int a, b, c;
//         try{
//             a = 5;
//             b = 0;
//             c = a/b;
//             System.out.println(c);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Division by zero is not possible!");
//         }
//         System.out.println("End of program");
//     }
// }


class A{
    public static void main(String args[]) throws Exception{
        try{
            int A[] = {10, 0, 20, 30};
            try{
                int r;
                r = A[0] / A[1];
                System.out.println(r);
            }
            catch(ArithmeticException e){
                System.out.println("Divisible by 0 is not possible");
            }
            System.out.println(A[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound");
        }
    }
}

// to_String(x);
// toString()
