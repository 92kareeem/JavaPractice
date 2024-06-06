//Program to Demonstrate the use of StringTokenizer class
import java.util.*;
class StringTokenizerDemo
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int count=0;
System.out.print(“Enter numbers seperated by comma:”);
String input=s.next();
StringTokenizer st=new StringTokenizer(input,”,”);
int sum=0;
while(st.hasMoreTokens())
{
int n=0;
n=Integer.parseInt(st.nextToken());
count++;
System.out.println(“Number”+count+” is: “+n);
sum+=n
}
System.out.println(“Sum of the “+count+” numbers is:”+sum);
}
}