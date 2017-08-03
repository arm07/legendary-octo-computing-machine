import java.util.*;

class CalendarClass{

public static void main(String[] args){

Calendar cal=Calendar.getInstance();
cal.set(2000,Calendar.AUGUST,30);
cal.roll(Calendar.MONTH,7);

System.out.println("" + cal.get(Calendar.DATE) +"-"+ cal.get(Calendar.MONTH)+ "-" +cal.get(Calendar.YEAR));

cal.add(Calendar.MONTH,11);

System.out.println("" + cal.get(Calendar.DATE) +"-"+ cal.get(Calendar.MONTH)+ "-" +cal.get(Calendar.YEAR));



}
}

/* Output
30-2-2000
28-1-2001
*/
