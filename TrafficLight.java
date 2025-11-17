import java.applet.Applet;
import java.awt.*;
public class TrafficLight extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        g.fillRect(50, 50, 100, 260);  
        g.setColor(Color.red);
        g.fillOval(70, 70, 60, 60);
        g.setColor(Color.yellow);
        g.fillOval(70, 150, 60, 60);
        g.setColor(Color.green);
        g.fillOval(70, 230, 60, 60);
    }
}
/*
<html>
<body>
<applet code="TrafficLight.class" codebase="." width="400" height="400">
</applet>
</body>
</html>
*/
