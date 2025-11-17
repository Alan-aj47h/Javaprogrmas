import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

 public class Olypics extends Applet
{
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g.setColor(Color.blue);
        g.drawOval(20,50,100,100);
        g.setColor(Color.black);
        g.drawOval(140,50,100,100);
        g.setColor(Color.red);
        g.drawOval(260,50,100,100);
        g.setColor(Color.yellow);
        g.drawOval(80,100,100,100);
        g.setColor(Color.green);
        g.drawOval(200,100,100,100);
    }
}

/*
<html>
<body>
<applet code ="Olypics.class" codebase="." width="400" height="400">
</applet>
</body>
</html>
*/