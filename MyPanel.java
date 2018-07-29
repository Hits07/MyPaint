import java.awt.*;

class MyPanel extends Panel
{
int ch;
Color c=new Color(0,0,0);
int x1,y1,x2,y2;
public void paint(Graphics g)
{
g.setColor(c);
if(ch==1)
g.fillRect(x1,y1,x2-x1,y2-y1);
if(ch==2)
g.fillOval(x1,y1,x2-x1,y2-y1);
if(ch==3)
g.drawLine(x1,y1,x2,y2);
if(ch==4)
g.fillRoundRect(x1,y1,x2-x1,y2-y1,10,10);


}





}