//program to demonstrate File Handling in java
import java.io.File;
public class FileInformation {
public static void main(String args[]){
File myobj=new File("F:\\FileHandling\\File1.txt");
if(myobj.exists()) {
System.out.println("File name: "+myobj.getName());
System.out.println("Absolute path: "+myobj.getAbsolutePath());
System.out.println("Writeable: "+myobj.canWrite());
System.out.println("Readable: "+myobj.canRead());
System.out.println("File size in bytes: "+myobj.length());
}
else{
System.out.println("File does not exist");
}
}
}