import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample extends Frame implements MouseListener{
    Label l1;
    MouseListenerExample(){
        Frame f=new Frame("Mouse event");
        f.addMouseListener(this);
        l1=new Label();
        l1.setBounds(40, 150, 150, 200);
        f.add(l1);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void mouselicked(MouseEvent e){
        l1.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e){
        l1.setText("Mouse Entered");
    }
    public void mousePressed(MouseEvent e){
        l1.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e){
        l1.setText("Mouse Released");
    }
    public void mouseExited(MouseEvent e){
        l1.setText("Mouse Exited");
    }
    public static void main(String args[]){
        new MouseListenerExample();
    }
}