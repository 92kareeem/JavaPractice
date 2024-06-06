import java.io.*;
class student implements Serializable{
public int stuRoll;
public String stuName;
}
class SerializationDemo{
public static void main(String args[]){
student s1=new student();
s1.stuRoll=5;
s1.stuName="Kareem";
String filename="D:\\Testfile\\Test.txt";
try{
FileOutputStream fos=new FileOutputStream(filename);
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.WriteObject(s1)c int stuRoll;
public String stuName;
}
class SerializationDemo{
public static void main(String args[]){
student s1=new student();
s1.stuRoll=5;
s1.stuName="Kareem";
String filename="D:\\Testfile\\Test.txt";
try{
FileOutputStream fos=new FileOutputStream(filename);
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.WriteObject(s1);
oos.close();
fos.close();
System.out.println("Object is saved in file");
}catch(IOException e){
System.out.println(e);
}
}
};
oos.close();
fos.close();
System.out.println("Object is saved in file");
}catch(IOException e){
System.out.println(e);
}
}
} 
