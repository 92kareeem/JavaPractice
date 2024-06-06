//KeyBoard Event Handling program
import java.awt.*;
import java.awt.event.*;
public class KeyListenerExample extends Frame implements KeyListener {Label l1;
TextArea ta;
KeyListenerExample() {
Frame f = new Frame("Keyboard Event");
l1 = new Label();
l1.setBounds(10,50,200,400);
ta = new TextArea();
ta.setBounds(20,30,300,100);
ta.addKeyListener(this);
f.add(l1);
f.add(ta);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public void keyPressed(KeyEvent e){
l1.setText("Key Pressed");
}
public void keyReleased(KeyEvent e){
l1.setText("Key Released");
}
public void keyTyped(KeyEvent e){
l1.setText("Key Typed");
}
public static void main(String args[])
{
new KeyListenerExample();
}
}