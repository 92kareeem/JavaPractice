import java.io.*;
class Student implements Serializable {
    public int Stu_roll; 
    public String Stu_name;
}
class SerialDemo { 
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.Stu_roll = 21;
        s1.Stu_name = "XYZ"; 
        String filename = "C:\\syed\\test.txt";//Your file name location
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("Object saved in file");
        } catch(IOException e) { 
            System.out.println(e);
        }
    }
}
