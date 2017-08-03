
package cert;
public class Parent{

protected static int count=0;
public Parent(){
	System.out.println("p");
count++;
}
static int getCount(){
	System.out.println("pM");
return count;
}
}