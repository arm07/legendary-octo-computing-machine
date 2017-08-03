

import java.util.*;

public class RuntimeClass{

public static void main(String[] args){


System.out.println("Current JVM heap size" +Runtime.getRuntime().totalMemory());
System.out.println("max JVM Heap Size" +Runtime.getRuntime().maxMemory());
System.out.println("free JVM Heap Size" +Runtime.getRuntime().freeMemory());

}
}