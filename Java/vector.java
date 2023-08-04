import java.util.*;
public class vector {
    public static void main(String args[]){
        Vector<Integer> v = new Vector<Integer>(3,2);
        System.out.println("Initial size:"+ v.size());
        System.out.println("Initial capacity:"+ v.capacity());
        v.addElement(1);
        v.addElement(3);
        v.addElement(2);
        v.addElement(8);
        System.out.println("Capacity after four additions:"+v.capacity());
        v.addElement(5);
        System.out.println("Current capacity :"+ v.capacity());
        v.addElement(6);
        System.out.println("current capacity :"+v.capacity());
    }
}