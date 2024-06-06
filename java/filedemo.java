import java.io.*;
class Main{
public static void main(String args[]){
try{
File obj=new File("D:\\Filedemo\\F1.txt");
if(obj.createNewFile())
{
System.out.println("File created");
System.out.println(obj.canRead());
System.out.println(obj.canWrite());
System.out.println(obj.getName());
}
}
catch(IOException e)
{
System.out.println(e);
}
}
}
 
