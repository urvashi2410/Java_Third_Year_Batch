// package StringBuffer;
// Stringbuffer = bunch of characters 
// "Hello world hi is a am" = 
// append  = insert at the end of the stringbuffer 
// String vs stringbuffer = immutable vs mutable + we can change the size of stringbuffer too

public class A {
    public static void main(String args[]){
        // String name = "Hello";
        // hello = yellowwwwww
        // mutable = no change 
        // name[i] = "o";
        // System.out.println(name);

        // hello 
        // Stringbuffer class 
        // sb = ibject 
        // sb = reference variable 
        // default constructor

        // empty strint buffer 
        // capacity = 16 
        // StringBuffer sb = new StringBuffer();
        // sb.append("Hello");
        // System.out.println(sb);;

        // insert = takes a particular index and insert the value there 
        // sb.insert(2, "i");
        // System.out.println(sb);

        // replace = it takes start and end index and the string which is needed to be replaced with the characters already present in the stirng 
        // sb.replace(1, 3, "b");
        // sb.replace(1, 3, "bo");
        // sb.replace(1, 3, "boy");
        // System.out.println(sb);

        // delete = it deletes all the elements present btw the start and end indexes  
        // sb.delete(1, 3);
        // System.out.println(sb);

        // hello = olleh
        // reverse = 
        // sb.reverse();
        // System.out.println(sb); 

        // capacity = how much quantity it can contain at max 
        // size/length = how much quantity it is containing right now 

        // 10 = capacity 
        // 5 = length 

        // by default stringbuffer have 16 byte of capacity 
        // 4 byte = 4 integer 
        // 1 byte = 16 chars 

        // 16*2 + 2 = 32 + 2 = 34 

        // System.out.println(sb.length());
        // System.out.println(sb.capacity());

        // capacity is not clearly defined after 34 
        // sb.append("hellohfjksfsjkfgyfkhsdafhsdfhfffdssdhjsdhfdshfgdhsffkjsdjfjkdsfksdfskjfgsjkfjskdfgdsfksdf");

        // System.out.println(sb.length());
        // System.out.println(sb.capacity());

        // (16 + 2)*3 = 54

        // parameterised constructor 
        // capacity = 16 + length 
        // StringBuffer sb = new StringBuffer("hello");

        // StringBuffer sb = new StringBuffer(40);
        // System.out.println(sb.capacity());
    }
}
