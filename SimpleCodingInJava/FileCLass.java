

// SIMPLE CODE TO DELETE ORIGINAL FILE AND REPLACE WITH BACKUP FILE

import java.io.*;

public class FileClass{

public static void main(String[] args){

System.out.println("bef");
File f=new File("test.txt");
File b=new File("test.txt.bak");
b.delete();
f.renameTo(b);
System.out.println("af");
}

}