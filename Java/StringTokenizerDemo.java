import java.util.*;
public class StringTokenizerDemo {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int count=0;
        System.out.println("Enter numbers seperated by comma:");
        String input=s.next();
        StringTokenizer st = new StringTokenizer(input,",");
        int sum=0;
        while(st.hasMoreTokens())
        {
            int n=0;
            n=Integer.parseInt(st.nextToken());
            count++;
            System.out.println("Number"+count+"is:"+n);
            sum+=n;
        }
        System.out.println("Sum of the "+count+"numbers is:"+sum);
        }
    }
