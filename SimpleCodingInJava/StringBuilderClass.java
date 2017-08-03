
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