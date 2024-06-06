// Mouse Event Handling program
import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample extends Frame implements MouseListener
{
Label l1;
MouseListenerExample() {
Frame f=new Frame("Mouse Event");
f.addMouseListener(this);
l1 = new Label();
l1.setBounds(20,100,100,50);
f.add(l1);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
}
public void mouseClicked(MouseEvent e) {
l1.setText("Mouse clicked");
}
public void mouseEntered(MouseEvent e){
l1.setText("Mouse Entered");
}
public void mouseExited(MouseEvent e){
l1.setText("Mouse Exited");
}
public void mousePressed(MouseEvent e){
l1.setText("Mouse Pressed");
}
public void mouseReleased(MouseEvent e){
l1.setText("Mouse Released");
}
public static void main(String[] args){
new MouseListenerExample();
}
}