import java.util.*;
class Main {
 public static void main(String args[]) {
 TreeMap<String, Double> tm = new TreeMap<String,Double>();
 tm.put("John Doe", new Double(3434.34));
 tm.put("Tom Smith", new Double(123.22));
 tm.put("Jane Baker", new Double(1378.00));
 tm.put("Tod Hall", new Double(99.22));
 tm.put("Ralph Smith", new Double(-19.08));
 Set<Map.Entry<String, Double>> set = tm.entrySet();
 for(Map.Entry<String, Double> me : set) {
 System.out.print(me.getKey() + ": ");
 System.out.println(me.getValue());
 }
 System.out.println();
 double balance = tm.get("John Doe");
 tm.put("John Doe", balance + 1000);
 System.out.println("John Doe's new balance: " +tm.get("John Doe"));
 }
}
