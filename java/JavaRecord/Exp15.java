//Program to implement serialization concept.
import java.io.* ;
class Student implements Serializable {
publicintStu_roll;
public String Stu_name;
}
Class serialDemo throws Exception {
Public static void main(String args[])
{
Student s1= new Student();
s1.Stu_roll = 21;
s1.Stu_name =”XYZ”;
String filename = “D:\\FolderName\\test.txt” ;
try {
FileOutputStreamfos = new FileOutputStream(filename);
ObjectOutputStreamoos = new ObjectOutputStream(fos);
oos.writeObject(s1);
oos.close();
fos.close();
System.out.println(“object saved in file”);
} catch(IOException e)
System.out.println(e);
}
}
}