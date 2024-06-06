import java.io.*;
class BufferedReaderWriterDemo{
public static void main(String args[]) throws Exception{
BufferedReader br = new BufferedReader(new FileReader("in.txt"));
BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
int i;
do{
i=br.read();
if(i!=-1){
if(Character.isLowerCase((char)i))
	bw.write(Character.toUpperCase((char)i));
else if(Character.isUpperCase((char)i))
	bw.write(Character.toLowerCase((char)i));
else
	bw.write((char)i);
}
}while(i!=-1);
br.close();
bw.close();
}
}
