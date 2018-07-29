import java.awt.event.*;
import java.awt.*;

class MyPaint extends WindowAdapter implements ActionListener,MouseMotionListener,MouseListener
{
Frame f;
Rect r;
Oval o;
Line l;
RoundRect rr;
Button b;
MyPanel p;
MyPaint()
{
f=new Frame();
f.addWindowListener(this);
r=new Rect();
o=new Oval();
l=new Line();
rr=new RoundRect();
b=new Button("Pick Color");
p=new MyPanel();
p.addMouseListener(this);
p.addMouseMotionListener(this);

r.addActionListener(this);
o.addActionListener(this);
l.addActionListener(this);
rr.addActionListener(this);
b.addActionListener(this);

r.setBounds(10,30,30,30);
o.setBounds(45,30,30,30);
l.setBounds(10,65,30,30);
rr.setBounds(45,65,30,30);
b.setBounds(10,100,65,30);
p.setBackground(Color.yellow);
p.setBounds(80,20,400,400);
f.setLayout(null);
f.add(r);
f.add(o);
f.add(l);
f.add(rr);
f.add(b);
f.add(p);
f.setSize(500,500);
f.setVisible(true);
}
public static void main(String ar[])
{
MyPaint pp=new MyPaint();
}
public void windowClosing(WindowEvent e)
{
f.dispose();
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==r)
p.ch=1;
if(e.getSource()==o)
p.ch=2;
if(e.getSource()==l)
p.ch=3;
if(e.getSource()==rr)
p.ch=4;
if(e.getSource()==b)
{
javax.swing.JColorChooser jc=new javax.swing.JColorChooser();
p.c=jc.showDialog(null,"Pick Color",Color.red);
}
}
public void mouseMoved(MouseEvent e)
{
}
public void mouseDragged(MouseEvent e)
{
p.x2=e.getX();
p.y2=e.getY();
p.repaint();
}
public void mousePressed(MouseEvent e)
{
p.x1=e.getX();
p.y1=e.getY();

}
public void mouseReleased(MouseEvent e)
{
}
public void mouseClicked(MouseEvent e)
{
}
public void mouseEntered(MouseEvent e)
{
}
public void mouseExited(MouseEvent e)
{
}














}
