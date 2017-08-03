

import java.util.*;

public class RuntimeClass{

public static void main(String[] args){


System.out.println("Current JVM heap size" +Runtime.getRuntime().totalMemory());
System.out.println("max JVM Heap Size" +Runtime.getRuntime().maxMemory());
System.out.println("free JVM Heap Size" +Runtime.getRuntime().freeMemory());

}
}

/* Output

Current JVM heap size191365120
max JVM Heap Size2833776640
free JVM Heap Size189351816

*/