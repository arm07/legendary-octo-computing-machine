
import java.util.*;

class StringBuilderClass{

public static void main(String[] args){
	StringBuilder s=new StringBuilder();
	
	for(String arg:args){
		if(s.indexOf(arg)<1)
			s.append(arg +" ");
	}
	System.out.println(s.toString());
	Scanner sc=new Scanner(s.toString());
	while(sc.hasNext()){
		if(sc.hasNext())
			System.out.print(sc.nextInt() +"");
		else
			sc.next();
	}
}
}
/*
OUTPUT
java StringBuilderClass Test null Test 1 2 3 test
Test null Test 1 2 3 test
Exception in thread "main" java.util.InputMismatchException
        at java.util.Scanner.throwFor(Unknown Source)
        at java.util.Scanner.next(Unknown Source)
        at java.util.Scanner.nextInt(Unknown Source)
        at java.util.Scanner.nextInt(Unknown Source)
        at StringBuilderClass.main(StringBuilderClass.java:17)
		
		*/