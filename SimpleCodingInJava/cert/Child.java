
// Simple Prog to test Inheritance and package 

package cert;

//import java.util.*;

import java.io.*;
//import ex.Parent;

public class Child extends Parent{
public Child(){
	System.out.println("c");
count++;
}
public static void main(String[] args){

//int x=6;
System.out.println("Count="+getCount());
Child o=new Child();
System.out.println("Count="+getCount());
//System.out.println(x=~x);
System.out.println(Runtime.getRuntime().totalMemory());
}
}

/*
Output:
Count=0
Count=2
*/