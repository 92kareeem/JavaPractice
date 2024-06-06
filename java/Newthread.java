class Newthread implements Runnable{
String name;
Thread t;
Newthread(String threadname){
name=threadname;
t=new Thread(this,name);
System.out.println("New Thread:"+t);
t.start();
}
public void run(){
try{
for(int i=5;i>0;i--){
System.out.println(name +":"+i);
Thread.sleep(1000);
}
}catch (InterruptedException e){
System.out.println(name +"interrupted");
}
}
}
class Main{
public static void main(String args[]){
new Newthread("One");
new Newthread("Two");
new Newthread("Three");
try{
Thread.sleep(1000);
}catch(InterruptedException e){
System.out.println("Main thread interrupted");
}
System.out.println("Main thread exiting");
}
}

