import java.applet.Applet;
import java.awt.*;

public class ShapeApplet extends Applet
{
    int rectWidth,rectHeight;
    int circleRadius;
    public void init()
    {
        String w = getParameter("rectWidth");
        String h = getParameter("rectHeight");
        String r = getParameter("radius");

        rectWidth = Integer.parseInt(w);
        rectHeight = Integer.parseInt(h);
        circleRadius = Integer.parseInt(r);

    }
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawRect(20,20,rectWidth,rectHeight);
        g.setColor(Color.blue);
        g.drawOval(20,40 + rectHeight,circleRadius,circleRadius);
    }
}
/*
<html>
<body>
<applet code="ShapeApplet.class" codebase="." width="400" height="400">
<param name="rectWidth" value="150">
<param name="rectHeight" value="80">
<param name="radius" value="100">
</applet>
</body>
</html>
*/