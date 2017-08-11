
package test;
 
public class STest extends Sub{

public String value(){
return "Stest";
}
public static void main(String[] args){
STest t=new STest();
boolean b=false;
char i='t';

if(t instanceof SType){
	System.out.println((b=false) ? ((Super)t).value():b);
}
else{
	System.out.println((b=true) ? ((Sub)t).value():i);
}
}
}

//Output:
//false